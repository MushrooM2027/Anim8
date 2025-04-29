@echo off
rem === Define reusable variables ===
set ANTLR_JAR=antlr-4.13.2-complete.jar
set SRC_DIR=src
set PARSER_DIR=%SRC_DIR%\parser
set BIN_DIR=bin
set JAVA_FX_LIB=D:\Downloads\javafx-sdk-24\lib
set DSL_INPUT=script.dsl

rem --- Clean old generated files ---
del /Q %PARSER_DIR%\UI*.java
del /Q %PARSER_DIR%\UI*.*

rem --- Generate ANTLR parser/lexer in package 'parser' ---
java -jar %ANTLR_JAR% -visitor -listener -Dlanguage=Java -package parser -o %PARSER_DIR% UI.g4

rem --- Clean and recreate bin directory ---
if exist %BIN_DIR% rmdir /S /Q %BIN_DIR%
mkdir %BIN_DIR%

rem --- Generate list of all .java files into sources.txt ---
del sources.txt 2>nul
for /R %SRC_DIR% %%f in (*.java) do echo %%f >> sources.txt

rem --- Compile all .java files at once (ensures dependencies are respected) ---
echo Compiling all Java files...
javac -cp "%ANTLR_JAR%;%BIN_DIR%" -d %BIN_DIR% @sources.txt
if errorlevel 1 (
    echo [ERROR] Compilation failed.
    del sources.txt
    exit /b 1
)
del sources.txt

rem --- Check if DSLCompiler.class exists ---
if exist %BIN_DIR%\DSLCompiler.class (
    echo DSLCompiler compiled successfully.
) else (
    echo [ERROR] DSLCompiler.class not found! Make sure DSLCompiler.java is in 'src' and has no 'package' declaration.
    exit /b 1
)

rem --- Run the DSLCompiler ---
java -cp "%BIN_DIR%;%ANTLR_JAR%" DSLCompiler %DSL_INPUT%

rem --- Compile the generated application ---
javac --module-path %JAVA_FX_LIB% --add-modules javafx.controls -d %BIN_DIR% GeneratedApp.java

rem --- Run the application ---
java --module-path %JAVA_FX_LIB% --add-modules javafx.controls -cp %BIN_DIR% GeneratedApp
