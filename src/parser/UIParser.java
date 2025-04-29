// Generated from UI.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, STRING=28, IDENTIFIER=29, INT=30, WS=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_windowDeclaration = 2, RULE_componentDeclaration = 3, 
		RULE_component = 4, RULE_labelComponent = 5, RULE_textfieldComponent = 6, 
		RULE_checkboxComponent = 7, RULE_dropdownComponent = 8, RULE_buttonComponent = 9, 
		RULE_labelProperty = 10, RULE_textfieldProperty = 11, RULE_checkboxProperty = 12, 
		RULE_dropdownProperty = 13, RULE_buttonProperty = 14, RULE_stringList = 15, 
		RULE_layoutType = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "windowDeclaration", "componentDeclaration", 
			"component", "labelComponent", "textfieldComponent", "checkboxComponent", 
			"dropdownComponent", "buttonComponent", "labelProperty", "textfieldProperty", 
			"checkboxProperty", "dropdownProperty", "buttonProperty", "stringList", 
			"layoutType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'window'", "'size'", "'x'", "'layout'", "'add'", "'label'", 
			"'textfield'", "'id'", "'checkbox'", "'dropdown'", "'options'", "'button'", 
			"'onClick'", "'showAlert'", "'font'", "'color'", "'placeholder'", "'width'", 
			"'default'", "'checked'", "'disabled'", "','", "'VBox'", "'HBox'", "'GridPane'", 
			"'Pane'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "IDENTIFIER", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UIParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__5) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public WindowDeclarationContext windowDeclaration() {
			return getRuleContext(WindowDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				windowDeclaration();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				componentDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowDeclarationContext extends ParserRuleContext {
		public Token title;
		public Token width;
		public Token height;
		public LayoutTypeContext layout;
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(UIParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(UIParser.INT, i);
		}
		public LayoutTypeContext layoutType() {
			return getRuleContext(LayoutTypeContext.class,0);
		}
		public WindowDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterWindowDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitWindowDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitWindowDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowDeclarationContext windowDeclaration() throws RecognitionException {
		WindowDeclarationContext _localctx = new WindowDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_windowDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(T__1);
			setState(48);
			((WindowDeclarationContext)_localctx).title = match(STRING);
			setState(49);
			match(T__2);
			setState(50);
			((WindowDeclarationContext)_localctx).width = match(INT);
			setState(51);
			match(T__3);
			setState(52);
			((WindowDeclarationContext)_localctx).height = match(INT);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(53);
				match(T__4);
				setState(54);
				((WindowDeclarationContext)_localctx).layout = layoutType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__5);
			setState(58);
			component();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public LabelComponentContext labelComponent() {
			return getRuleContext(LabelComponentContext.class,0);
		}
		public TextfieldComponentContext textfieldComponent() {
			return getRuleContext(TextfieldComponentContext.class,0);
		}
		public CheckboxComponentContext checkboxComponent() {
			return getRuleContext(CheckboxComponentContext.class,0);
		}
		public DropdownComponentContext dropdownComponent() {
			return getRuleContext(DropdownComponentContext.class,0);
		}
		public ButtonComponentContext buttonComponent() {
			return getRuleContext(ButtonComponentContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_component);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				labelComponent();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				textfieldComponent();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				checkboxComponent();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				dropdownComponent();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				buttonComponent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelComponentContext extends ParserRuleContext {
		public Token text;
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<LabelPropertyContext> labelProperty() {
			return getRuleContexts(LabelPropertyContext.class);
		}
		public LabelPropertyContext labelProperty(int i) {
			return getRuleContext(LabelPropertyContext.class,i);
		}
		public LabelComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterLabelComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitLabelComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitLabelComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelComponentContext labelComponent() throws RecognitionException {
		LabelComponentContext _localctx = new LabelComponentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__6);
			setState(68);
			((LabelComponentContext)_localctx).text = match(STRING);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 196616L) != 0)) {
				{
				{
				setState(69);
				labelProperty();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextfieldComponentContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<TextfieldPropertyContext> textfieldProperty() {
			return getRuleContexts(TextfieldPropertyContext.class);
		}
		public TextfieldPropertyContext textfieldProperty(int i) {
			return getRuleContext(TextfieldPropertyContext.class,i);
		}
		public TextfieldComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textfieldComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTextfieldComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTextfieldComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTextfieldComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextfieldComponentContext textfieldComponent() throws RecognitionException {
		TextfieldComponentContext _localctx = new TextfieldComponentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textfieldComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__7);
			setState(76);
			match(T__8);
			setState(77);
			((TextfieldComponentContext)_localctx).id = match(IDENTIFIER);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				{
				setState(78);
				textfieldProperty();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CheckboxComponentContext extends ParserRuleContext {
		public Token label;
		public Token id;
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<CheckboxPropertyContext> checkboxProperty() {
			return getRuleContexts(CheckboxPropertyContext.class);
		}
		public CheckboxPropertyContext checkboxProperty(int i) {
			return getRuleContext(CheckboxPropertyContext.class,i);
		}
		public CheckboxComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkboxComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterCheckboxComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitCheckboxComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitCheckboxComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckboxComponentContext checkboxComponent() throws RecognitionException {
		CheckboxComponentContext _localctx = new CheckboxComponentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_checkboxComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__9);
			setState(85);
			((CheckboxComponentContext)_localctx).label = match(STRING);
			setState(86);
			match(T__8);
			setState(87);
			((CheckboxComponentContext)_localctx).id = match(IDENTIFIER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__21) {
				{
				{
				setState(88);
				checkboxProperty();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropdownComponentContext extends ParserRuleContext {
		public Token id;
		public StringListContext options;
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public List<DropdownPropertyContext> dropdownProperty() {
			return getRuleContexts(DropdownPropertyContext.class);
		}
		public DropdownPropertyContext dropdownProperty(int i) {
			return getRuleContext(DropdownPropertyContext.class,i);
		}
		public DropdownComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropdownComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDropdownComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDropdownComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDropdownComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropdownComponentContext dropdownComponent() throws RecognitionException {
		DropdownComponentContext _localctx = new DropdownComponentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dropdownComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__10);
			setState(95);
			match(T__8);
			setState(96);
			((DropdownComponentContext)_localctx).id = match(IDENTIFIER);
			setState(97);
			match(T__11);
			setState(98);
			((DropdownComponentContext)_localctx).options = stringList();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(99);
				dropdownProperty();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonComponentContext extends ParserRuleContext {
		public Token label;
		public Token alertText;
		public List<TerminalNode> STRING() { return getTokens(UIParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UIParser.STRING, i);
		}
		public List<ButtonPropertyContext> buttonProperty() {
			return getRuleContexts(ButtonPropertyContext.class);
		}
		public ButtonPropertyContext buttonProperty(int i) {
			return getRuleContext(ButtonPropertyContext.class,i);
		}
		public ButtonComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterButtonComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitButtonComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitButtonComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonComponentContext buttonComponent() throws RecognitionException {
		ButtonComponentContext _localctx = new ButtonComponentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_buttonComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(106);
			((ButtonComponentContext)_localctx).label = match(STRING);
			setState(107);
			match(T__13);
			setState(108);
			match(T__14);
			setState(109);
			((ButtonComponentContext)_localctx).alertText = match(STRING);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__21) {
				{
				{
				setState(110);
				buttonProperty();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelPropertyContext extends ParserRuleContext {
		public Token font;
		public Token size;
		public Token color;
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public LabelPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterLabelProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitLabelProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitLabelProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelPropertyContext labelProperty() throws RecognitionException {
		LabelPropertyContext _localctx = new LabelPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_labelProperty);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__15);
				setState(117);
				((LabelPropertyContext)_localctx).font = match(STRING);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__2);
				setState(119);
				((LabelPropertyContext)_localctx).size = match(INT);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T__16);
				setState(121);
				((LabelPropertyContext)_localctx).color = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextfieldPropertyContext extends ParserRuleContext {
		public Token placeholder;
		public Token width;
		public Token defaultValue;
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public TextfieldPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textfieldProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTextfieldProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTextfieldProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTextfieldProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextfieldPropertyContext textfieldProperty() throws RecognitionException {
		TextfieldPropertyContext _localctx = new TextfieldPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_textfieldProperty);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__17);
				setState(125);
				((TextfieldPropertyContext)_localctx).placeholder = match(STRING);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__18);
				setState(127);
				((TextfieldPropertyContext)_localctx).width = match(INT);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__19);
				setState(129);
				((TextfieldPropertyContext)_localctx).defaultValue = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CheckboxPropertyContext extends ParserRuleContext {
		public CheckboxPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkboxProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterCheckboxProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitCheckboxProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitCheckboxProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckboxPropertyContext checkboxProperty() throws RecognitionException {
		CheckboxPropertyContext _localctx = new CheckboxPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_checkboxProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropdownPropertyContext extends ParserRuleContext {
		public Token width;
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public DropdownPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropdownProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDropdownProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDropdownProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDropdownProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropdownPropertyContext dropdownProperty() throws RecognitionException {
		DropdownPropertyContext _localctx = new DropdownPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dropdownProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__18);
			setState(135);
			((DropdownPropertyContext)_localctx).width = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonPropertyContext extends ParserRuleContext {
		public Token width;
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public ButtonPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterButtonProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitButtonProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitButtonProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonPropertyContext buttonProperty() throws RecognitionException {
		ButtonPropertyContext _localctx = new ButtonPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_buttonProperty);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__18);
				setState(138);
				((ButtonPropertyContext)_localctx).width = match(INT);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringListContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(UIParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UIParser.STRING, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(STRING);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(143);
				match(T__22);
				setState(144);
				match(STRING);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayoutTypeContext extends ParserRuleContext {
		public LayoutTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterLayoutType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitLayoutType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitLayoutType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutTypeContext layoutType() throws RecognitionException {
		LayoutTypeContext _localctx = new LayoutTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_layoutType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006P\b\u0006\n\u0006"+
		"\f\u0006S\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007Z\b\u0007\n\u0007\f\u0007]\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\be\b\b\n\b\f\bh\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\tp\b\t\n\t\f\ts\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n{\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0083\b\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u008d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0092\b\u000f\n\u000f\f\u000f\u0095\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0002\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u0018\u001b\u0099\u0000%\u0001\u0000\u0000\u0000\u0002,\u0001"+
		"\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000"+
		"\u0000\bA\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fK\u0001"+
		"\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000"+
		"\u0000\u0012i\u0001\u0000\u0000\u0000\u0014z\u0001\u0000\u0000\u0000\u0016"+
		"\u0082\u0001\u0000\u0000\u0000\u0018\u0084\u0001\u0000\u0000\u0000\u001a"+
		"\u0086\u0001\u0000\u0000\u0000\u001c\u008c\u0001\u0000\u0000\u0000\u001e"+
		"\u008e\u0001\u0000\u0000\u0000 \u0096\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001"+
		"\u0000\u0000\u0000*-\u0003\u0004\u0002\u0000+-\u0003\u0006\u0003\u0000"+
		",*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0003\u0001\u0000"+
		"\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0005\u0002\u0000\u000001\u0005"+
		"\u001c\u0000\u000012\u0005\u0003\u0000\u000023\u0005\u001e\u0000\u0000"+
		"34\u0005\u0004\u0000\u000047\u0005\u001e\u0000\u000056\u0005\u0005\u0000"+
		"\u000068\u0003 \u0010\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008\u0005\u0001\u0000\u0000\u00009:\u0005\u0006\u0000\u0000:;\u0003"+
		"\b\u0004\u0000;\u0007\u0001\u0000\u0000\u0000<B\u0003\n\u0005\u0000=B"+
		"\u0003\f\u0006\u0000>B\u0003\u000e\u0007\u0000?B\u0003\u0010\b\u0000@"+
		"B\u0003\u0012\t\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000"+
		"A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000B\t\u0001\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000DH\u0005\u001c"+
		"\u0000\u0000EG\u0003\u0014\n\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u000b"+
		"\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005\b\u0000\u0000"+
		"LM\u0005\t\u0000\u0000MQ\u0005\u001d\u0000\u0000NP\u0003\u0016\u000b\u0000"+
		"ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000R\r\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000TU\u0005\n\u0000\u0000UV\u0005\u001c\u0000\u0000VW\u0005\t"+
		"\u0000\u0000W[\u0005\u001d\u0000\u0000XZ\u0003\u0018\f\u0000YX\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^_\u0005\u000b\u0000\u0000_`\u0005\t\u0000\u0000`a\u0005\u001d\u0000"+
		"\u0000ab\u0005\f\u0000\u0000bf\u0003\u001e\u000f\u0000ce\u0003\u001a\r"+
		"\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0011\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ij\u0005\r\u0000\u0000jk\u0005\u001c\u0000\u0000"+
		"kl\u0005\u000e\u0000\u0000lm\u0005\u000f\u0000\u0000mq\u0005\u001c\u0000"+
		"\u0000np\u0003\u001c\u000e\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0013"+
		"\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0010\u0000"+
		"\u0000u{\u0005\u001c\u0000\u0000vw\u0005\u0003\u0000\u0000w{\u0005\u001e"+
		"\u0000\u0000xy\u0005\u0011\u0000\u0000y{\u0005\u001c\u0000\u0000zt\u0001"+
		"\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"{\u0015\u0001\u0000\u0000\u0000|}\u0005\u0012\u0000\u0000}\u0083\u0005"+
		"\u001c\u0000\u0000~\u007f\u0005\u0013\u0000\u0000\u007f\u0083\u0005\u001e"+
		"\u0000\u0000\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0083\u0005\u001c"+
		"\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0017\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u0019\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0013\u0000\u0000\u0087\u0088\u0005\u001e\u0000\u0000"+
		"\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0013\u0000\u0000"+
		"\u008a\u008d\u0005\u001e\u0000\u0000\u008b\u008d\u0005\u0016\u0000\u0000"+
		"\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u001d\u0001\u0000\u0000\u0000\u008e\u0093\u0005\u001c\u0000\u0000"+
		"\u008f\u0090\u0005\u0017\u0000\u0000\u0090\u0092\u0005\u001c\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u001f\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0007\u0001\u0000\u0000\u0097!\u0001\u0000\u0000\u0000\r"+
		"%,7AHQ[fqz\u0082\u008c\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}