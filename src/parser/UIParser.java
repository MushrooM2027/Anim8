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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		STRING=186, BOOLEAN=187, IDENTIFIER=188, INT=189, FLOAT=190, LINE_COMMENT=191, 
		BLOCK_COMMENT=192, WS=193;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_globalStyle = 2, RULE_windowDeclaration = 3, 
		RULE_componentDeclaration = 4, RULE_component = 5, RULE_labelComponent = 6, 
		RULE_textfieldComponent = 7, RULE_passwordFieldComponent = 8, RULE_textAreaComponent = 9, 
		RULE_checkboxComponent = 10, RULE_dropdownComponent = 11, RULE_buttonComponent = 12, 
		RULE_imageComponent = 13, RULE_sliderComponent = 14, RULE_progressBarComponent = 15, 
		RULE_tableViewComponent = 16, RULE_radioButtonComponent = 17, RULE_listViewComponent = 18, 
		RULE_menuBarComponent = 19, RULE_toolBarComponent = 20, RULE_datePickerComponent = 21, 
		RULE_webViewComponent = 22, RULE_tabPaneComponent = 23, RULE_tab = 24, 
		RULE_accordionComponent = 25, RULE_titledPaneComponent = 26, RULE_treeViewComponent = 27, 
		RULE_spinnerComponent = 28, RULE_colorPickerComponent = 29, RULE_fileChooserComponent = 30, 
		RULE_directoryChooserComponent = 31, RULE_canvasComponent = 32, RULE_mediaViewComponent = 33, 
		RULE_scrollPaneComponent = 34, RULE_splitPaneComponent = 35, RULE_treeTableViewComponent = 36, 
		RULE_dialogComponent = 37, RULE_chartComponent = 38, RULE_chartType = 39, 
		RULE_eventBinding = 40, RULE_animationBinding = 41, RULE_animationType = 42, 
		RULE_effectBinding = 43, RULE_effectType = 44, RULE_eventAction = 45, 
		RULE_chartProperty = 46, RULE_labelProperty = 47, RULE_textfieldProperty = 48, 
		RULE_passwordFieldProperty = 49, RULE_textAreaProperty = 50, RULE_checkboxProperty = 51, 
		RULE_dropdownProperty = 52, RULE_buttonProperty = 53, RULE_imageProperty = 54, 
		RULE_sliderProperty = 55, RULE_progressBarProperty = 56, RULE_tableViewProperty = 57, 
		RULE_radioButtonProperty = 58, RULE_listViewProperty = 59, RULE_menuDefinition = 60, 
		RULE_menu = 61, RULE_datePickerProperty = 62, RULE_webViewProperty = 63, 
		RULE_layoutDeclaration = 64, RULE_styleDeclaration = 65, RULE_layoutProperty = 66, 
		RULE_styleProperty = 67, RULE_treeViewProperty = 68, RULE_spinnerProperty = 69, 
		RULE_colorPickerProperty = 70, RULE_fileChooserProperty = 71, RULE_mediaViewProperty = 72, 
		RULE_scrollPaneProperty = 73, RULE_splitPaneProperty = 74, RULE_treeTableViewProperty = 75, 
		RULE_dialogProperty = 76, RULE_columnList = 77, RULE_stringList = 78, 
		RULE_alignmentType = 79, RULE_layoutType = 80, RULE_orientationType = 81, 
		RULE_selectionModeType = 82, RULE_modalityType = 83, RULE_stageStyleType = 84, 
		RULE_dialogType = 85, RULE_dataList = 86, RULE_dataPair = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "globalStyle", "windowDeclaration", "componentDeclaration", 
			"component", "labelComponent", "textfieldComponent", "passwordFieldComponent", 
			"textAreaComponent", "checkboxComponent", "dropdownComponent", "buttonComponent", 
			"imageComponent", "sliderComponent", "progressBarComponent", "tableViewComponent", 
			"radioButtonComponent", "listViewComponent", "menuBarComponent", "toolBarComponent", 
			"datePickerComponent", "webViewComponent", "tabPaneComponent", "tab", 
			"accordionComponent", "titledPaneComponent", "treeViewComponent", "spinnerComponent", 
			"colorPickerComponent", "fileChooserComponent", "directoryChooserComponent", 
			"canvasComponent", "mediaViewComponent", "scrollPaneComponent", "splitPaneComponent", 
			"treeTableViewComponent", "dialogComponent", "chartComponent", "chartType", 
			"eventBinding", "animationBinding", "animationType", "effectBinding", 
			"effectType", "eventAction", "chartProperty", "labelProperty", "textfieldProperty", 
			"passwordFieldProperty", "textAreaProperty", "checkboxProperty", "dropdownProperty", 
			"buttonProperty", "imageProperty", "sliderProperty", "progressBarProperty", 
			"tableViewProperty", "radioButtonProperty", "listViewProperty", "menuDefinition", 
			"menu", "datePickerProperty", "webViewProperty", "layoutDeclaration", 
			"styleDeclaration", "layoutProperty", "styleProperty", "treeViewProperty", 
			"spinnerProperty", "colorPickerProperty", "fileChooserProperty", "mediaViewProperty", 
			"scrollPaneProperty", "splitPaneProperty", "treeTableViewProperty", "dialogProperty", 
			"columnList", "stringList", "alignmentType", "layoutType", "orientationType", 
			"selectionModeType", "modalityType", "stageStyleType", "dialogType", 
			"dataList", "dataPair"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'importStyle'", "'create'", "'window'", "'size'", "'x'", "'resizable'", 
			"'position'", "'y'", "'modality'", "'stageStyle'", "'layout'", "'add'", 
			"'label'", "'textfield'", "'id'", "'passwordField'", "'textArea'", "'checkbox'", 
			"'dropdown'", "'options'", "'button'", "'onClick'", "'image'", "'source'", 
			"'slider'", "'min'", "'max'", "'value'", "'progressBar'", "'progress'", 
			"'tableView'", "'columns'", "'radioButton'", "'listView'", "'items'", 
			"'menuBar'", "'toolBar'", "'datePicker'", "'webView'", "'url'", "'tabPane'", 
			"'{'", "'}'", "'tab'", "'accordion'", "'titledPane'", "'treeView'", "'spinner'", 
			"'colorPicker'", "'fileChooser'", "'title'", "'directoryChooser'", "'canvas'", 
			"'width'", "'height'", "'mediaView'", "'scrollPane'", "'splitPane'", 
			"'orientation'", "'treeTableView'", "'dialog'", "'chart'", "'data'", 
			"'PieChart'", "'BarChart'", "'LineChart'", "'onEvent'", "'do'", "'animate'", 
			"'duration'", "'cycleCount'", "'autoReverse'", "'fade'", "'rotate'", 
			"'scale'", "'translate'", "'effect'", "'dropShadow'", "'glow'", "'bloom'", 
			"'sepia'", "'gaussianBlur'", "'showAlert'", "'print'", "'navigate'", 
			"'to'", "'legendVisible'", "'animated'", "'categoryAxisLabel'", "'valueAxisLabel'", 
			"'font'", "'color'", "'bold'", "'italic'", "'tooltip'", "'placeholder'", 
			"'default'", "'editable'", "'onChange'", "'bindTo'", "'promptText'", 
			"'wrapText'", "'checked'", "'disabled'", "'indeterminate'", "'onToggle'", 
			"'multipleSelection'", "'onSelect'", "'defaultButton'", "'fitWidth'", 
			"'fitHeight'", "'preserveRatio'", "'blockIncrement'", "'onValueChange'", 
			"'sortableColumns'", "'selected'", "'group'", "'selectionMode'", "'menu'", 
			"'showWeekNumbers'", "'zoom'", "'type'", "'style'", "'row'", "'column'", 
			"'rowSpan'", "'columnSpan'", "'alignment'", "'padding'", "'spacing'", 
			"'margin'", "'hgrow'", "'vgrow'", "'visibleIf'", "'backgroundColor'", 
			"'borderColor'", "'borderWidth'", "'opacity'", "'visible'", "'styleClass'", 
			"'showRoot'", "'initialValue'", "'defaultColor'", "'initialDirectory'", 
			"'extensionFilters'", "'fitToWidth'", "'fitToHeight'", "'pannable'", 
			"'dividerPositions'", "','", "'content'", "'header'", "'graphic'", "'modal'", 
			"'buttons'", "'CENTER'", "'TOP_LEFT'", "'TOP_RIGHT'", "'BOTTOM_LEFT'", 
			"'BOTTOM_RIGHT'", "'VBox'", "'HBox'", "'GridPane'", "'Pane'", "'BorderPane'", 
			"'StackPane'", "'FlowPane'", "'TilePane'", "'HORIZONTAL'", "'VERTICAL'", 
			"'SINGLE'", "'MULTIPLE'", "'NONE'", "'WINDOW_MODAL'", "'APPLICATION_MODAL'", 
			"'DECORATED'", "'UNDECORATED'", "'TRANSPARENT'", "'UTILITY'", "'UNIFIED'", 
			"'INFORMATION'", "'WARNING'", "'CONFIRMATION'", "'ERROR'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "BOOLEAN", "IDENTIFIER", 
			"INT", "FLOAT", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6150L) != 0) || _la==T__122) {
				{
				{
				setState(176);
				statement();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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
		public LayoutDeclarationContext layoutDeclaration() {
			return getRuleContext(LayoutDeclarationContext.class,0);
		}
		public StyleDeclarationContext styleDeclaration() {
			return getRuleContext(StyleDeclarationContext.class,0);
		}
		public GlobalStyleContext globalStyle() {
			return getRuleContext(GlobalStyleContext.class,0);
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
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				windowDeclaration();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				componentDeclaration();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				layoutDeclaration();
				}
				break;
			case T__122:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				styleDeclaration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				globalStyle();
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
	public static class GlobalStyleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public GlobalStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterGlobalStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitGlobalStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitGlobalStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStyleContext globalStyle() throws RecognitionException {
		GlobalStyleContext _localctx = new GlobalStyleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__0);
			setState(192);
			match(STRING);
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
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(UIParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(UIParser.INT, i);
		}
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public ModalityTypeContext modalityType() {
			return getRuleContext(ModalityTypeContext.class,0);
		}
		public StageStyleTypeContext stageStyleType() {
			return getRuleContext(StageStyleTypeContext.class,0);
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
		enterRule(_localctx, 6, RULE_windowDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__1);
			setState(195);
			match(T__2);
			setState(196);
			match(STRING);
			setState(197);
			match(T__3);
			setState(198);
			match(INT);
			setState(199);
			match(T__4);
			setState(200);
			match(INT);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(201);
				match(T__5);
				setState(202);
				match(BOOLEAN);
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(205);
				match(T__6);
				setState(206);
				match(T__4);
				setState(207);
				match(INT);
				setState(208);
				match(T__7);
				setState(209);
				match(INT);
				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(212);
				match(T__8);
				setState(213);
				modalityType();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(216);
				match(T__9);
				setState(217);
				stageStyleType();
				}
			}

			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(220);
				match(T__10);
				setState(221);
				layoutType();
				}
				break;
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
		enterRule(_localctx, 8, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__11);
			setState(225);
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
		public PasswordFieldComponentContext passwordFieldComponent() {
			return getRuleContext(PasswordFieldComponentContext.class,0);
		}
		public TextAreaComponentContext textAreaComponent() {
			return getRuleContext(TextAreaComponentContext.class,0);
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
		public ImageComponentContext imageComponent() {
			return getRuleContext(ImageComponentContext.class,0);
		}
		public SliderComponentContext sliderComponent() {
			return getRuleContext(SliderComponentContext.class,0);
		}
		public ProgressBarComponentContext progressBarComponent() {
			return getRuleContext(ProgressBarComponentContext.class,0);
		}
		public TableViewComponentContext tableViewComponent() {
			return getRuleContext(TableViewComponentContext.class,0);
		}
		public RadioButtonComponentContext radioButtonComponent() {
			return getRuleContext(RadioButtonComponentContext.class,0);
		}
		public ListViewComponentContext listViewComponent() {
			return getRuleContext(ListViewComponentContext.class,0);
		}
		public MenuBarComponentContext menuBarComponent() {
			return getRuleContext(MenuBarComponentContext.class,0);
		}
		public ToolBarComponentContext toolBarComponent() {
			return getRuleContext(ToolBarComponentContext.class,0);
		}
		public DatePickerComponentContext datePickerComponent() {
			return getRuleContext(DatePickerComponentContext.class,0);
		}
		public WebViewComponentContext webViewComponent() {
			return getRuleContext(WebViewComponentContext.class,0);
		}
		public TabPaneComponentContext tabPaneComponent() {
			return getRuleContext(TabPaneComponentContext.class,0);
		}
		public AccordionComponentContext accordionComponent() {
			return getRuleContext(AccordionComponentContext.class,0);
		}
		public TitledPaneComponentContext titledPaneComponent() {
			return getRuleContext(TitledPaneComponentContext.class,0);
		}
		public TreeViewComponentContext treeViewComponent() {
			return getRuleContext(TreeViewComponentContext.class,0);
		}
		public SpinnerComponentContext spinnerComponent() {
			return getRuleContext(SpinnerComponentContext.class,0);
		}
		public ColorPickerComponentContext colorPickerComponent() {
			return getRuleContext(ColorPickerComponentContext.class,0);
		}
		public FileChooserComponentContext fileChooserComponent() {
			return getRuleContext(FileChooserComponentContext.class,0);
		}
		public DirectoryChooserComponentContext directoryChooserComponent() {
			return getRuleContext(DirectoryChooserComponentContext.class,0);
		}
		public CanvasComponentContext canvasComponent() {
			return getRuleContext(CanvasComponentContext.class,0);
		}
		public MediaViewComponentContext mediaViewComponent() {
			return getRuleContext(MediaViewComponentContext.class,0);
		}
		public ScrollPaneComponentContext scrollPaneComponent() {
			return getRuleContext(ScrollPaneComponentContext.class,0);
		}
		public SplitPaneComponentContext splitPaneComponent() {
			return getRuleContext(SplitPaneComponentContext.class,0);
		}
		public TreeTableViewComponentContext treeTableViewComponent() {
			return getRuleContext(TreeTableViewComponentContext.class,0);
		}
		public DialogComponentContext dialogComponent() {
			return getRuleContext(DialogComponentContext.class,0);
		}
		public ChartComponentContext chartComponent() {
			return getRuleContext(ChartComponentContext.class,0);
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
		enterRule(_localctx, 10, RULE_component);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				labelComponent();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				textfieldComponent();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				passwordFieldComponent();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				textAreaComponent();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				checkboxComponent();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				dropdownComponent();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				buttonComponent();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				imageComponent();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(235);
				sliderComponent();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 10);
				{
				setState(236);
				progressBarComponent();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 11);
				{
				setState(237);
				tableViewComponent();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 12);
				{
				setState(238);
				radioButtonComponent();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 13);
				{
				setState(239);
				listViewComponent();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 14);
				{
				setState(240);
				menuBarComponent();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 15);
				{
				setState(241);
				toolBarComponent();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 16);
				{
				setState(242);
				datePickerComponent();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 17);
				{
				setState(243);
				webViewComponent();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 18);
				{
				setState(244);
				tabPaneComponent();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 19);
				{
				setState(245);
				accordionComponent();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 20);
				{
				setState(246);
				titledPaneComponent();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 21);
				{
				setState(247);
				treeViewComponent();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 22);
				{
				setState(248);
				spinnerComponent();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 23);
				{
				setState(249);
				colorPickerComponent();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 24);
				{
				setState(250);
				fileChooserComponent();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 25);
				{
				setState(251);
				directoryChooserComponent();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 26);
				{
				setState(252);
				canvasComponent();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 27);
				{
				setState(253);
				mediaViewComponent();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 28);
				{
				setState(254);
				scrollPaneComponent();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 29);
				{
				setState(255);
				splitPaneComponent();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 30);
				{
				setState(256);
				treeTableViewComponent();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 31);
				{
				setState(257);
				dialogComponent();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 32);
				{
				setState(258);
				chartComponent();
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
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<LabelPropertyContext> labelProperty() {
			return getRuleContexts(LabelPropertyContext.class);
		}
		public LabelPropertyContext labelProperty(int i) {
			return getRuleContext(LabelPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<AnimationBindingContext> animationBinding() {
			return getRuleContexts(AnimationBindingContext.class);
		}
		public AnimationBindingContext animationBinding(int i) {
			return getRuleContext(AnimationBindingContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
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
		enterRule(_localctx, 12, RULE_labelComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__12);
			setState(262);
			match(STRING);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					labelProperty();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					layoutProperty();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(275);
				animationBinding();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(281);
				eventBinding();
				}
				}
				setState(286);
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
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<TextfieldPropertyContext> textfieldProperty() {
			return getRuleContexts(TextfieldPropertyContext.class);
		}
		public TextfieldPropertyContext textfieldProperty(int i) {
			return getRuleContext(TextfieldPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
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
		enterRule(_localctx, 14, RULE_textfieldComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__13);
			setState(288);
			match(T__14);
			setState(289);
			match(IDENTIFIER);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					textfieldProperty();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					layoutProperty();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(302);
				eventBinding();
				}
				}
				setState(307);
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
	public static class PasswordFieldComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<PasswordFieldPropertyContext> passwordFieldProperty() {
			return getRuleContexts(PasswordFieldPropertyContext.class);
		}
		public PasswordFieldPropertyContext passwordFieldProperty(int i) {
			return getRuleContext(PasswordFieldPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public PasswordFieldComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwordFieldComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterPasswordFieldComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitPasswordFieldComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitPasswordFieldComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordFieldComponentContext passwordFieldComponent() throws RecognitionException {
		PasswordFieldComponentContext _localctx = new PasswordFieldComponentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_passwordFieldComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__15);
			setState(309);
			match(T__14);
			setState(310);
			match(IDENTIFIER);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					passwordFieldProperty();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					layoutProperty();
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(323);
				eventBinding();
				}
				}
				setState(328);
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
	public static class TextAreaComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<TextAreaPropertyContext> textAreaProperty() {
			return getRuleContexts(TextAreaPropertyContext.class);
		}
		public TextAreaPropertyContext textAreaProperty(int i) {
			return getRuleContext(TextAreaPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public TextAreaComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textAreaComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTextAreaComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTextAreaComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTextAreaComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextAreaComponentContext textAreaComponent() throws RecognitionException {
		TextAreaComponentContext _localctx = new TextAreaComponentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_textAreaComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__16);
			setState(330);
			match(T__14);
			setState(331);
			match(IDENTIFIER);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					textAreaProperty();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					layoutProperty();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(344);
				eventBinding();
				}
				}
				setState(349);
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
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<CheckboxPropertyContext> checkboxProperty() {
			return getRuleContexts(CheckboxPropertyContext.class);
		}
		public CheckboxPropertyContext checkboxProperty(int i) {
			return getRuleContext(CheckboxPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
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
		enterRule(_localctx, 20, RULE_checkboxComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__17);
			setState(351);
			match(STRING);
			setState(352);
			match(T__14);
			setState(353);
			match(IDENTIFIER);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					checkboxProperty();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					layoutProperty();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(366);
				eventBinding();
				}
				}
				setState(371);
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
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
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
		enterRule(_localctx, 22, RULE_dropdownComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__18);
			setState(373);
			match(T__14);
			setState(374);
			match(IDENTIFIER);
			setState(375);
			match(T__19);
			setState(376);
			stringList();
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377);
					dropdownProperty();
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(383);
					layoutProperty();
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(389);
				eventBinding();
				}
				}
				setState(394);
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
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public EventActionContext eventAction() {
			return getRuleContext(EventActionContext.class,0);
		}
		public List<ButtonPropertyContext> buttonProperty() {
			return getRuleContexts(ButtonPropertyContext.class);
		}
		public ButtonPropertyContext buttonProperty(int i) {
			return getRuleContext(ButtonPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<AnimationBindingContext> animationBinding() {
			return getRuleContexts(AnimationBindingContext.class);
		}
		public AnimationBindingContext animationBinding(int i) {
			return getRuleContext(AnimationBindingContext.class,i);
		}
		public List<EffectBindingContext> effectBinding() {
			return getRuleContexts(EffectBindingContext.class);
		}
		public EffectBindingContext effectBinding(int i) {
			return getRuleContext(EffectBindingContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
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
		enterRule(_localctx, 24, RULE_buttonComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__20);
			setState(396);
			match(STRING);
			setState(397);
			match(T__21);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 7L) != 0)) {
				{
				setState(398);
				eventAction();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					buttonProperty();
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407);
					layoutProperty();
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					animationBinding();
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__76) {
				{
				{
				setState(419);
				effectBinding();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(425);
				animationBinding();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(431);
				eventBinding();
				}
				}
				setState(436);
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
	public static class ImageComponentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<ImagePropertyContext> imageProperty() {
			return getRuleContexts(ImagePropertyContext.class);
		}
		public ImagePropertyContext imageProperty(int i) {
			return getRuleContext(ImagePropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<AnimationBindingContext> animationBinding() {
			return getRuleContexts(AnimationBindingContext.class);
		}
		public AnimationBindingContext animationBinding(int i) {
			return getRuleContext(AnimationBindingContext.class,i);
		}
		public ImageComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterImageComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitImageComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitImageComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageComponentContext imageComponent() throws RecognitionException {
		ImageComponentContext _localctx = new ImageComponentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_imageComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__22);
			setState(438);
			match(T__23);
			setState(439);
			match(STRING);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 7L) != 0)) {
				{
				{
				setState(440);
				imageProperty();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -144115188075855871L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 15L) != 0)) {
				{
				{
				setState(446);
				layoutProperty();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__68) {
				{
				{
				setState(452);
				animationBinding();
				}
				}
				setState(457);
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
	public static class SliderComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<TerminalNode> INT() { return getTokens(UIParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(UIParser.INT, i);
		}
		public List<SliderPropertyContext> sliderProperty() {
			return getRuleContexts(SliderPropertyContext.class);
		}
		public SliderPropertyContext sliderProperty(int i) {
			return getRuleContext(SliderPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public SliderComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliderComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterSliderComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitSliderComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitSliderComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliderComponentContext sliderComponent() throws RecognitionException {
		SliderComponentContext _localctx = new SliderComponentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sliderComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__24);
			setState(459);
			match(T__14);
			setState(460);
			match(IDENTIFIER);
			setState(461);
			match(T__25);
			setState(462);
			match(INT);
			setState(463);
			match(T__26);
			setState(464);
			match(INT);
			setState(465);
			match(T__27);
			setState(466);
			match(INT);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					sliderProperty();
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					layoutProperty();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(479);
				eventBinding();
				}
				}
				setState(484);
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
	public static class ProgressBarComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public TerminalNode FLOAT() { return getToken(UIParser.FLOAT, 0); }
		public List<ProgressBarPropertyContext> progressBarProperty() {
			return getRuleContexts(ProgressBarPropertyContext.class);
		}
		public ProgressBarPropertyContext progressBarProperty(int i) {
			return getRuleContext(ProgressBarPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public ProgressBarComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progressBarComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterProgressBarComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitProgressBarComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitProgressBarComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgressBarComponentContext progressBarComponent() throws RecognitionException {
		ProgressBarComponentContext _localctx = new ProgressBarComponentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_progressBarComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__28);
			setState(486);
			match(T__14);
			setState(487);
			match(IDENTIFIER);
			setState(488);
			match(T__29);
			setState(489);
			match(FLOAT);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__104) {
				{
				{
				setState(490);
				progressBarProperty();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -144115188075855871L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 15L) != 0)) {
				{
				{
				setState(496);
				layoutProperty();
				}
				}
				setState(501);
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
	public static class TableViewComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public List<TableViewPropertyContext> tableViewProperty() {
			return getRuleContexts(TableViewPropertyContext.class);
		}
		public TableViewPropertyContext tableViewProperty(int i) {
			return getRuleContext(TableViewPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public TableViewComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableViewComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTableViewComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTableViewComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTableViewComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableViewComponentContext tableViewComponent() throws RecognitionException {
		TableViewComponentContext _localctx = new TableViewComponentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableViewComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__30);
			setState(503);
			match(T__14);
			setState(504);
			match(IDENTIFIER);
			setState(505);
			match(T__31);
			setState(506);
			columnList();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					tableViewProperty();
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -144115188075855871L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 15L) != 0)) {
				{
				{
				setState(513);
				layoutProperty();
				}
				}
				setState(518);
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
	public static class RadioButtonComponentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<RadioButtonPropertyContext> radioButtonProperty() {
			return getRuleContexts(RadioButtonPropertyContext.class);
		}
		public RadioButtonPropertyContext radioButtonProperty(int i) {
			return getRuleContext(RadioButtonPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public RadioButtonComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radioButtonComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterRadioButtonComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitRadioButtonComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitRadioButtonComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RadioButtonComponentContext radioButtonComponent() throws RecognitionException {
		RadioButtonComponentContext _localctx = new RadioButtonComponentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_radioButtonComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(T__32);
			setState(520);
			match(STRING);
			setState(521);
			match(T__14);
			setState(522);
			match(IDENTIFIER);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					radioButtonProperty();
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(529);
					layoutProperty();
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(535);
				eventBinding();
				}
				}
				setState(540);
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
	public static class ListViewComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public List<ListViewPropertyContext> listViewProperty() {
			return getRuleContexts(ListViewPropertyContext.class);
		}
		public ListViewPropertyContext listViewProperty(int i) {
			return getRuleContext(ListViewPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public ListViewComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listViewComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterListViewComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitListViewComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitListViewComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListViewComponentContext listViewComponent() throws RecognitionException {
		ListViewComponentContext _localctx = new ListViewComponentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listViewComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(T__33);
			setState(542);
			match(T__14);
			setState(543);
			match(IDENTIFIER);
			setState(544);
			match(T__34);
			setState(545);
			stringList();
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(546);
					listViewProperty();
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					layoutProperty();
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(558);
				eventBinding();
				}
				}
				setState(563);
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
	public static class MenuBarComponentContext extends ParserRuleContext {
		public MenuDefinitionContext menuDefinition() {
			return getRuleContext(MenuDefinitionContext.class,0);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public MenuBarComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuBarComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterMenuBarComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitMenuBarComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitMenuBarComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuBarComponentContext menuBarComponent() throws RecognitionException {
		MenuBarComponentContext _localctx = new MenuBarComponentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_menuBarComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__35);
			setState(565);
			menuDefinition();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -144115188075855871L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 15L) != 0)) {
				{
				{
				setState(566);
				layoutProperty();
				}
				}
				setState(571);
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
	public static class ToolBarComponentContext extends ParserRuleContext {
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public ToolBarComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toolBarComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterToolBarComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitToolBarComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitToolBarComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToolBarComponentContext toolBarComponent() throws RecognitionException {
		ToolBarComponentContext _localctx = new ToolBarComponentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_toolBarComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__36);
			setState(573);
			match(T__34);
			setState(574);
			stringList();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -144115188075855871L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 15L) != 0)) {
				{
				{
				setState(575);
				layoutProperty();
				}
				}
				setState(580);
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
	public static class DatePickerComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<DatePickerPropertyContext> datePickerProperty() {
			return getRuleContexts(DatePickerPropertyContext.class);
		}
		public DatePickerPropertyContext datePickerProperty(int i) {
			return getRuleContext(DatePickerPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public DatePickerComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datePickerComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDatePickerComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDatePickerComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDatePickerComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatePickerComponentContext datePickerComponent() throws RecognitionException {
		DatePickerComponentContext _localctx = new DatePickerComponentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datePickerComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__37);
			setState(582);
			match(T__14);
			setState(583);
			match(IDENTIFIER);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(584);
					datePickerProperty();
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(590);
					layoutProperty();
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(596);
				eventBinding();
				}
				}
				setState(601);
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
	public static class WebViewComponentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<WebViewPropertyContext> webViewProperty() {
			return getRuleContexts(WebViewPropertyContext.class);
		}
		public WebViewPropertyContext webViewProperty(int i) {
			return getRuleContext(WebViewPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public WebViewComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webViewComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterWebViewComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitWebViewComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitWebViewComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebViewComponentContext webViewComponent() throws RecognitionException {
		WebViewComponentContext _localctx = new WebViewComponentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_webViewComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__38);
			setState(603);
			match(T__39);
			setState(604);
			match(STRING);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					webViewProperty();
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(611);
					layoutProperty();
					}
					} 
				}
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(617);
				eventBinding();
				}
				}
				setState(622);
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
	public static class TabPaneComponentContext extends ParserRuleContext {
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public TabPaneComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabPaneComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTabPaneComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTabPaneComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTabPaneComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabPaneComponentContext tabPaneComponent() throws RecognitionException {
		TabPaneComponentContext _localctx = new TabPaneComponentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tabPaneComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(T__40);
			setState(624);
			match(T__41);
			setState(626); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(625);
				tab();
				}
				}
				setState(628); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__43 );
			setState(630);
			match(T__42);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631);
					layoutProperty();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(637);
				eventBinding();
				}
				}
				setState(642);
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
	public static class TabContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(T__43);
			setState(644);
			match(STRING);
			setState(645);
			match(T__41);
			setState(647); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(646);
				component();
				}
				}
				setState(649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8590584363151745024L) != 0) );
			setState(651);
			match(T__42);
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
	public static class AccordionComponentContext extends ParserRuleContext {
		public List<TitledPaneComponentContext> titledPaneComponent() {
			return getRuleContexts(TitledPaneComponentContext.class);
		}
		public TitledPaneComponentContext titledPaneComponent(int i) {
			return getRuleContext(TitledPaneComponentContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public AccordionComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accordionComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterAccordionComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitAccordionComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitAccordionComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccordionComponentContext accordionComponent() throws RecognitionException {
		AccordionComponentContext _localctx = new AccordionComponentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_accordionComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T__44);
			setState(654);
			match(T__41);
			setState(656); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(655);
				titledPaneComponent();
				}
				}
				setState(658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__45 );
			setState(660);
			match(T__42);
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					layoutProperty();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(667);
				eventBinding();
				}
				}
				setState(672);
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
	public static class TitledPaneComponentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public TitledPaneComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titledPaneComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTitledPaneComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTitledPaneComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTitledPaneComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitledPaneComponentContext titledPaneComponent() throws RecognitionException {
		TitledPaneComponentContext _localctx = new TitledPaneComponentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_titledPaneComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(T__45);
			setState(674);
			match(STRING);
			setState(675);
			match(T__41);
			setState(677); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(676);
				component();
				}
				}
				setState(679); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8590584363151745024L) != 0) );
			setState(681);
			match(T__42);
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					layoutProperty();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(688);
				eventBinding();
				}
				}
				setState(693);
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
	public static class TreeViewComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<TreeViewPropertyContext> treeViewProperty() {
			return getRuleContexts(TreeViewPropertyContext.class);
		}
		public TreeViewPropertyContext treeViewProperty(int i) {
			return getRuleContext(TreeViewPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public TreeViewComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeViewComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTreeViewComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTreeViewComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTreeViewComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreeViewComponentContext treeViewComponent() throws RecognitionException {
		TreeViewComponentContext _localctx = new TreeViewComponentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_treeViewComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(T__46);
			setState(695);
			match(T__14);
			setState(696);
			match(IDENTIFIER);
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(697);
					treeViewProperty();
					}
					} 
				}
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(703);
					layoutProperty();
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(709);
				eventBinding();
				}
				}
				setState(714);
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
	public static class SpinnerComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<TerminalNode> INT() { return getTokens(UIParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(UIParser.INT, i);
		}
		public List<SpinnerPropertyContext> spinnerProperty() {
			return getRuleContexts(SpinnerPropertyContext.class);
		}
		public SpinnerPropertyContext spinnerProperty(int i) {
			return getRuleContext(SpinnerPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public SpinnerComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spinnerComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterSpinnerComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitSpinnerComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitSpinnerComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpinnerComponentContext spinnerComponent() throws RecognitionException {
		SpinnerComponentContext _localctx = new SpinnerComponentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_spinnerComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(T__47);
			setState(716);
			match(T__14);
			setState(717);
			match(IDENTIFIER);
			setState(718);
			match(T__25);
			setState(719);
			match(INT);
			setState(720);
			match(T__26);
			setState(721);
			match(INT);
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					spinnerProperty();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(728);
					layoutProperty();
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(734);
				eventBinding();
				}
				}
				setState(739);
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
	public static class ColorPickerComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<ColorPickerPropertyContext> colorPickerProperty() {
			return getRuleContexts(ColorPickerPropertyContext.class);
		}
		public ColorPickerPropertyContext colorPickerProperty(int i) {
			return getRuleContext(ColorPickerPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public ColorPickerComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorPickerComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterColorPickerComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitColorPickerComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitColorPickerComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorPickerComponentContext colorPickerComponent() throws RecognitionException {
		ColorPickerComponentContext _localctx = new ColorPickerComponentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_colorPickerComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(T__48);
			setState(741);
			match(T__14);
			setState(742);
			match(IDENTIFIER);
			setState(746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					colorPickerProperty();
					}
					} 
				}
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(749);
					layoutProperty();
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(755);
				eventBinding();
				}
				}
				setState(760);
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
	public static class FileChooserComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<FileChooserPropertyContext> fileChooserProperty() {
			return getRuleContexts(FileChooserPropertyContext.class);
		}
		public FileChooserPropertyContext fileChooserProperty(int i) {
			return getRuleContext(FileChooserPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public FileChooserComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileChooserComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterFileChooserComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitFileChooserComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitFileChooserComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileChooserComponentContext fileChooserComponent() throws RecognitionException {
		FileChooserComponentContext _localctx = new FileChooserComponentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fileChooserComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(T__49);
			setState(762);
			match(T__14);
			setState(763);
			match(IDENTIFIER);
			setState(764);
			match(T__50);
			setState(765);
			match(STRING);
			setState(769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(766);
					fileChooserProperty();
					}
					} 
				}
				setState(771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772);
					layoutProperty();
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(778);
				eventBinding();
				}
				}
				setState(783);
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
	public static class DirectoryChooserComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public DirectoryChooserComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryChooserComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDirectoryChooserComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDirectoryChooserComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDirectoryChooserComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectoryChooserComponentContext directoryChooserComponent() throws RecognitionException {
		DirectoryChooserComponentContext _localctx = new DirectoryChooserComponentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_directoryChooserComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(T__51);
			setState(785);
			match(T__14);
			setState(786);
			match(IDENTIFIER);
			setState(787);
			match(T__50);
			setState(788);
			match(STRING);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(789);
					layoutProperty();
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(795);
				eventBinding();
				}
				}
				setState(800);
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
	public static class CanvasComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<TerminalNode> INT() { return getTokens(UIParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(UIParser.INT, i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public CanvasComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvasComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterCanvasComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitCanvasComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitCanvasComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanvasComponentContext canvasComponent() throws RecognitionException {
		CanvasComponentContext _localctx = new CanvasComponentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_canvasComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(T__52);
			setState(802);
			match(T__14);
			setState(803);
			match(IDENTIFIER);
			setState(804);
			match(T__53);
			setState(805);
			match(INT);
			setState(806);
			match(T__54);
			setState(807);
			match(INT);
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808);
					layoutProperty();
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(814);
				eventBinding();
				}
				}
				setState(819);
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
	public static class MediaViewComponentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public List<MediaViewPropertyContext> mediaViewProperty() {
			return getRuleContexts(MediaViewPropertyContext.class);
		}
		public MediaViewPropertyContext mediaViewProperty(int i) {
			return getRuleContext(MediaViewPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public MediaViewComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaViewComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterMediaViewComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitMediaViewComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitMediaViewComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaViewComponentContext mediaViewComponent() throws RecognitionException {
		MediaViewComponentContext _localctx = new MediaViewComponentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mediaViewComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(T__55);
			setState(821);
			match(T__23);
			setState(822);
			match(STRING);
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(823);
					mediaViewProperty();
					}
					} 
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(829);
					layoutProperty();
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(835);
				eventBinding();
				}
				}
				setState(840);
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
	public static class ScrollPaneComponentContext extends ParserRuleContext {
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<ScrollPanePropertyContext> scrollPaneProperty() {
			return getRuleContexts(ScrollPanePropertyContext.class);
		}
		public ScrollPanePropertyContext scrollPaneProperty(int i) {
			return getRuleContext(ScrollPanePropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public ScrollPaneComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrollPaneComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterScrollPaneComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitScrollPaneComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitScrollPaneComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScrollPaneComponentContext scrollPaneComponent() throws RecognitionException {
		ScrollPaneComponentContext _localctx = new ScrollPaneComponentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_scrollPaneComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(T__56);
			setState(842);
			match(T__41);
			setState(844); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(843);
				component();
				}
				}
				setState(846); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8590584363151745024L) != 0) );
			setState(848);
			match(T__42);
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(849);
					scrollPaneProperty();
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(855);
					layoutProperty();
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(861);
				eventBinding();
				}
				}
				setState(866);
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
	public static class SplitPaneComponentContext extends ParserRuleContext {
		public OrientationTypeContext orientationType() {
			return getRuleContext(OrientationTypeContext.class,0);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<SplitPanePropertyContext> splitPaneProperty() {
			return getRuleContexts(SplitPanePropertyContext.class);
		}
		public SplitPanePropertyContext splitPaneProperty(int i) {
			return getRuleContext(SplitPanePropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public SplitPaneComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitPaneComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterSplitPaneComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitSplitPaneComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitSplitPaneComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplitPaneComponentContext splitPaneComponent() throws RecognitionException {
		SplitPaneComponentContext _localctx = new SplitPaneComponentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_splitPaneComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(T__57);
			setState(868);
			match(T__58);
			setState(869);
			orientationType();
			setState(870);
			match(T__41);
			setState(872); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(871);
				component();
				}
				}
				setState(874); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8590584363151745024L) != 0) );
			setState(876);
			match(T__42);
			setState(880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(877);
					splitPaneProperty();
					}
					} 
				}
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(883);
					layoutProperty();
					}
					} 
				}
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(889);
				eventBinding();
				}
				}
				setState(894);
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
	public static class TreeTableViewComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public List<TreeTableViewPropertyContext> treeTableViewProperty() {
			return getRuleContexts(TreeTableViewPropertyContext.class);
		}
		public TreeTableViewPropertyContext treeTableViewProperty(int i) {
			return getRuleContext(TreeTableViewPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public TreeTableViewComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeTableViewComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTreeTableViewComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTreeTableViewComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTreeTableViewComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreeTableViewComponentContext treeTableViewComponent() throws RecognitionException {
		TreeTableViewComponentContext _localctx = new TreeTableViewComponentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_treeTableViewComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(T__59);
			setState(896);
			match(T__14);
			setState(897);
			match(IDENTIFIER);
			setState(898);
			match(T__31);
			setState(899);
			columnList();
			setState(903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(900);
					treeTableViewProperty();
					}
					} 
				}
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(906);
					layoutProperty();
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(912);
				eventBinding();
				}
				}
				setState(917);
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
	public static class DialogComponentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<DialogPropertyContext> dialogProperty() {
			return getRuleContexts(DialogPropertyContext.class);
		}
		public DialogPropertyContext dialogProperty(int i) {
			return getRuleContext(DialogPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public DialogComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialogComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDialogComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDialogComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDialogComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DialogComponentContext dialogComponent() throws RecognitionException {
		DialogComponentContext _localctx = new DialogComponentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dialogComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(T__60);
			setState(919);
			match(STRING);
			setState(920);
			match(T__14);
			setState(921);
			match(IDENTIFIER);
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(922);
					dialogProperty();
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(928);
					layoutProperty();
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(934);
				eventBinding();
				}
				}
				setState(939);
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
	public static class ChartComponentContext extends ParserRuleContext {
		public ChartTypeContext chartType() {
			return getRuleContext(ChartTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public DataListContext dataList() {
			return getRuleContext(DataListContext.class,0);
		}
		public List<ChartPropertyContext> chartProperty() {
			return getRuleContexts(ChartPropertyContext.class);
		}
		public ChartPropertyContext chartProperty(int i) {
			return getRuleContext(ChartPropertyContext.class,i);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public List<EventBindingContext> eventBinding() {
			return getRuleContexts(EventBindingContext.class);
		}
		public EventBindingContext eventBinding(int i) {
			return getRuleContext(EventBindingContext.class,i);
		}
		public ChartComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chartComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterChartComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitChartComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitChartComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChartComponentContext chartComponent() throws RecognitionException {
		ChartComponentContext _localctx = new ChartComponentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_chartComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(T__61);
			setState(941);
			chartType();
			setState(942);
			match(T__14);
			setState(943);
			match(IDENTIFIER);
			setState(944);
			match(T__50);
			setState(945);
			match(STRING);
			setState(946);
			match(T__62);
			setState(947);
			dataList();
			setState(951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(948);
					chartProperty();
					}
					} 
				}
				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(954);
					layoutProperty();
					}
					} 
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(960);
				eventBinding();
				}
				}
				setState(965);
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
	public static class ChartTypeContext extends ParserRuleContext {
		public ChartTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chartType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterChartType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitChartType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitChartType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChartTypeContext chartType() throws RecognitionException {
		ChartTypeContext _localctx = new ChartTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_chartType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
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
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public EventActionContext eventAction() {
			return getRuleContext(EventActionContext.class,0);
		}
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(T__66);
			setState(969);
			match(STRING);
			setState(970);
			match(T__67);
			setState(971);
			eventAction();
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
	public static class AnimationBindingContext extends ParserRuleContext {
		public AnimationTypeContext animationType() {
			return getRuleContext(AnimationTypeContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(UIParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(UIParser.INT, i);
		}
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public AnimationBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterAnimationBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitAnimationBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitAnimationBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationBindingContext animationBinding() throws RecognitionException {
		AnimationBindingContext _localctx = new AnimationBindingContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_animationBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(T__68);
			setState(974);
			animationType();
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(975);
				match(T__69);
				setState(976);
				match(INT);
				}
			}

			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__70) {
				{
				setState(979);
				match(T__70);
				setState(980);
				match(INT);
				}
			}

			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__71) {
				{
				setState(983);
				match(T__71);
				setState(984);
				match(BOOLEAN);
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
	public static class AnimationTypeContext extends ParserRuleContext {
		public AnimationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterAnimationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitAnimationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitAnimationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationTypeContext animationType() throws RecognitionException {
		AnimationTypeContext _localctx = new AnimationTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_animationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 15L) != 0)) ) {
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
	public static class EffectBindingContext extends ParserRuleContext {
		public EffectTypeContext effectType() {
			return getRuleContext(EffectTypeContext.class,0);
		}
		public EffectBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterEffectBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitEffectBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitEffectBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectBindingContext effectBinding() throws RecognitionException {
		EffectBindingContext _localctx = new EffectBindingContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_effectBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(T__76);
			setState(990);
			effectType();
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
	public static class EffectTypeContext extends ParserRuleContext {
		public EffectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterEffectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitEffectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitEffectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectTypeContext effectType() throws RecognitionException {
		EffectTypeContext _localctx = new EffectTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_effectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 31L) != 0)) ) {
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
	public static class EventActionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public EventActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterEventAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitEventAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitEventAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventActionContext eventAction() throws RecognitionException {
		EventActionContext _localctx = new EventActionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_eventAction);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				match(T__82);
				setState(995);
				match(STRING);
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				match(T__83);
				setState(997);
				match(STRING);
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
				match(T__84);
				setState(999);
				match(T__85);
				setState(1000);
				match(STRING);
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
	public static class ChartPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public ChartPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chartProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterChartProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitChartProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitChartProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChartPropertyContext chartProperty() throws RecognitionException {
		ChartPropertyContext _localctx = new ChartPropertyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_chartProperty);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				match(T__86);
				setState(1004);
				match(BOOLEAN);
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(T__87);
				setState(1006);
				match(BOOLEAN);
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(T__88);
				setState(1008);
				match(STRING);
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 4);
				{
				setState(1009);
				match(T__89);
				setState(1010);
				match(STRING);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 5);
				{
				setState(1011);
				eventBinding();
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
	public static class LabelPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
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
		enterRule(_localctx, 94, RULE_labelProperty);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				match(T__90);
				setState(1015);
				match(STRING);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				match(T__3);
				setState(1017);
				match(INT);
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 3);
				{
				setState(1018);
				match(T__91);
				setState(1019);
				match(STRING);
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 4);
				{
				setState(1020);
				match(T__92);
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 5);
				{
				setState(1021);
				match(T__93);
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 6);
				{
				setState(1022);
				match(T__94);
				setState(1023);
				match(STRING);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 7);
				{
				setState(1024);
				eventBinding();
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
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventActionContext eventAction() {
			return getRuleContext(EventActionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_textfieldProperty);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__95:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(T__95);
				setState(1028);
				match(STRING);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				match(T__53);
				setState(1030);
				match(INT);
				}
				break;
			case T__96:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				match(T__96);
				setState(1032);
				match(STRING);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
				match(T__97);
				setState(1034);
				match(BOOLEAN);
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 5);
				{
				setState(1035);
				match(T__98);
				setState(1036);
				eventAction();
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 6);
				{
				setState(1037);
				match(T__94);
				setState(1038);
				match(STRING);
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 7);
				{
				setState(1039);
				match(T__99);
				setState(1040);
				match(IDENTIFIER);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 8);
				{
				setState(1041);
				eventBinding();
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
	public static class PasswordFieldPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public PasswordFieldPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwordFieldProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterPasswordFieldProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitPasswordFieldProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitPasswordFieldProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordFieldPropertyContext passwordFieldProperty() throws RecognitionException {
		PasswordFieldPropertyContext _localctx = new PasswordFieldPropertyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_passwordFieldProperty);
		try {
			setState(1049);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__100:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				match(T__100);
				setState(1045);
				match(STRING);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				match(T__97);
				setState(1047);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(1048);
				eventBinding();
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
	public static class TextAreaPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public TextAreaPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textAreaProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTextAreaProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTextAreaProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTextAreaProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextAreaPropertyContext textAreaProperty() throws RecognitionException {
		TextAreaPropertyContext _localctx = new TextAreaPropertyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_textAreaProperty);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__100:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				match(T__100);
				setState(1052);
				match(STRING);
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(T__101);
				setState(1054);
				match(BOOLEAN);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				match(T__97);
				setState(1056);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				eventBinding();
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
		public EventActionContext eventAction() {
			return getRuleContext(EventActionContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
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
		enterRule(_localctx, 102, RULE_checkboxProperty);
		try {
			setState(1066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__102:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				match(T__102);
				}
				break;
			case T__103:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				match(T__103);
				}
				break;
			case T__104:
				enterOuterAlt(_localctx, 3);
				{
				setState(1062);
				match(T__104);
				}
				break;
			case T__105:
				enterOuterAlt(_localctx, 4);
				{
				setState(1063);
				match(T__105);
				setState(1064);
				eventAction();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 5);
				{
				setState(1065);
				eventBinding();
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
	public static class DropdownPropertyContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventActionContext eventAction() {
			return getRuleContext(EventActionContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
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
		enterRule(_localctx, 104, RULE_dropdownProperty);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				match(T__53);
				setState(1069);
				match(INT);
				}
				break;
			case T__106:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(T__106);
				setState(1071);
				match(BOOLEAN);
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 3);
				{
				setState(1072);
				match(T__107);
				setState(1073);
				eventAction();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 4);
				{
				setState(1074);
				eventBinding();
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
	public static class ButtonPropertyContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
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
		enterRule(_localctx, 106, RULE_buttonProperty);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				match(T__53);
				setState(1078);
				match(INT);
				}
				break;
			case T__103:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				match(T__103);
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				match(T__108);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				eventBinding();
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
	public static class ImagePropertyContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public ImagePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterImageProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitImageProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitImageProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertyContext imageProperty() throws RecognitionException {
		ImagePropertyContext _localctx = new ImagePropertyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_imageProperty);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__109:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				match(T__109);
				setState(1085);
				match(INT);
				}
				break;
			case T__110:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				match(T__110);
				setState(1087);
				match(INT);
				}
				break;
			case T__111:
				enterOuterAlt(_localctx, 3);
				{
				setState(1088);
				match(T__111);
				setState(1089);
				match(BOOLEAN);
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
	public static class SliderPropertyContext extends ParserRuleContext {
		public OrientationTypeContext orientationType() {
			return getRuleContext(OrientationTypeContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(UIParser.FLOAT, 0); }
		public EventActionContext eventAction() {
			return getRuleContext(EventActionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public SliderPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliderProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterSliderProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitSliderProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitSliderProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliderPropertyContext sliderProperty() throws RecognitionException {
		SliderPropertyContext _localctx = new SliderPropertyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sliderProperty);
		try {
			setState(1101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				match(T__58);
				setState(1093);
				orientationType();
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(T__112);
				setState(1095);
				match(FLOAT);
				}
				break;
			case T__113:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				match(T__113);
				setState(1097);
				eventAction();
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 4);
				{
				setState(1098);
				match(T__99);
				setState(1099);
				match(IDENTIFIER);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 5);
				{
				setState(1100);
				eventBinding();
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
	public static class ProgressBarPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public ProgressBarPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progressBarProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterProgressBarProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitProgressBarProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitProgressBarProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgressBarPropertyContext progressBarProperty() throws RecognitionException {
		ProgressBarPropertyContext _localctx = new ProgressBarPropertyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_progressBarProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(T__104);
			setState(1104);
			match(BOOLEAN);
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
	public static class TableViewPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public TableViewPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableViewProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTableViewProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTableViewProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTableViewProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableViewPropertyContext tableViewProperty() throws RecognitionException {
		TableViewPropertyContext _localctx = new TableViewPropertyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tableViewProperty);
		try {
			setState(1111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				match(T__97);
				setState(1107);
				match(BOOLEAN);
				}
				break;
			case T__114:
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
				match(T__114);
				setState(1109);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				eventBinding();
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
	public static class RadioButtonPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public RadioButtonPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radioButtonProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterRadioButtonProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitRadioButtonProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitRadioButtonProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RadioButtonPropertyContext radioButtonProperty() throws RecognitionException {
		RadioButtonPropertyContext _localctx = new RadioButtonPropertyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_radioButtonProperty);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__115:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				match(T__115);
				setState(1114);
				match(BOOLEAN);
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(T__116);
				setState(1116);
				match(IDENTIFIER);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				eventBinding();
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
	public static class ListViewPropertyContext extends ParserRuleContext {
		public SelectionModeTypeContext selectionModeType() {
			return getRuleContext(SelectionModeTypeContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public ListViewPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listViewProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterListViewProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitListViewProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitListViewProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListViewPropertyContext listViewProperty() throws RecognitionException {
		ListViewPropertyContext _localctx = new ListViewPropertyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_listViewProperty);
		try {
			setState(1123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__117:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				match(T__117);
				setState(1121);
				selectionModeType();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				eventBinding();
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
	public static class MenuDefinitionContext extends ParserRuleContext {
		public List<MenuContext> menu() {
			return getRuleContexts(MenuContext.class);
		}
		public MenuContext menu(int i) {
			return getRuleContext(MenuContext.class,i);
		}
		public MenuDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterMenuDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitMenuDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitMenuDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuDefinitionContext menuDefinition() throws RecognitionException {
		MenuDefinitionContext _localctx = new MenuDefinitionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_menuDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1125);
				menu();
				}
				}
				setState(1128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__118 );
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
	public static class MenuContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public MenuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterMenu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitMenu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitMenu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuContext menu() throws RecognitionException {
		MenuContext _localctx = new MenuContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_menu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(T__118);
			setState(1131);
			match(STRING);
			setState(1132);
			match(T__34);
			setState(1133);
			stringList();
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
	public static class DatePickerPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public DatePickerPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datePickerProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDatePickerProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDatePickerProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDatePickerProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatePickerPropertyContext datePickerProperty() throws RecognitionException {
		DatePickerPropertyContext _localctx = new DatePickerPropertyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_datePickerProperty);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__119:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				match(T__119);
				setState(1136);
				match(BOOLEAN);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				match(T__97);
				setState(1138);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				eventBinding();
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
	public static class WebViewPropertyContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(UIParser.FLOAT, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public WebViewPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webViewProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterWebViewProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitWebViewProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitWebViewProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebViewPropertyContext webViewProperty() throws RecognitionException {
		WebViewPropertyContext _localctx = new WebViewPropertyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_webViewProperty);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__120:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				match(T__120);
				setState(1143);
				match(FLOAT);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				eventBinding();
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
	public static class LayoutDeclarationContext extends ParserRuleContext {
		public LayoutTypeContext layoutType() {
			return getRuleContext(LayoutTypeContext.class,0);
		}
		public List<LayoutPropertyContext> layoutProperty() {
			return getRuleContexts(LayoutPropertyContext.class);
		}
		public LayoutPropertyContext layoutProperty(int i) {
			return getRuleContext(LayoutPropertyContext.class,i);
		}
		public LayoutDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterLayoutDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitLayoutDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitLayoutDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutDeclarationContext layoutDeclaration() throws RecognitionException {
		LayoutDeclarationContext _localctx = new LayoutDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_layoutDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(T__10);
			setState(1148);
			match(T__121);
			setState(1149);
			layoutType();
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -144115188075855871L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 15L) != 0)) {
				{
				{
				setState(1150);
				layoutProperty();
				}
				}
				setState(1155);
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
	public static class StyleDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UIParser.IDENTIFIER, 0); }
		public List<StylePropertyContext> styleProperty() {
			return getRuleContexts(StylePropertyContext.class);
		}
		public StylePropertyContext styleProperty(int i) {
			return getRuleContext(StylePropertyContext.class,i);
		}
		public StyleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterStyleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitStyleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitStyleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleDeclarationContext styleDeclaration() throws RecognitionException {
		StyleDeclarationContext _localctx = new StyleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_styleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(T__122);
			setState(1157);
			match(T__14);
			setState(1158);
			match(IDENTIFIER);
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & 63L) != 0)) {
				{
				{
				setState(1159);
				styleProperty();
				}
				}
				setState(1164);
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
	public static class LayoutPropertyContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public AlignmentTypeContext alignmentType() {
			return getRuleContext(AlignmentTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public LayoutPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterLayoutProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitLayoutProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitLayoutProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutPropertyContext layoutProperty() throws RecognitionException {
		LayoutPropertyContext _localctx = new LayoutPropertyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_layoutProperty);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__123:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				match(T__123);
				setState(1166);
				match(INT);
				}
				break;
			case T__124:
				enterOuterAlt(_localctx, 2);
				{
				setState(1167);
				match(T__124);
				setState(1168);
				match(INT);
				}
				break;
			case T__125:
				enterOuterAlt(_localctx, 3);
				{
				setState(1169);
				match(T__125);
				setState(1170);
				match(INT);
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 4);
				{
				setState(1171);
				match(T__126);
				setState(1172);
				match(INT);
				}
				break;
			case T__127:
				enterOuterAlt(_localctx, 5);
				{
				setState(1173);
				match(T__127);
				setState(1174);
				alignmentType();
				}
				break;
			case T__128:
				enterOuterAlt(_localctx, 6);
				{
				setState(1175);
				match(T__128);
				setState(1176);
				match(INT);
				}
				break;
			case T__129:
				enterOuterAlt(_localctx, 7);
				{
				setState(1177);
				match(T__129);
				setState(1178);
				match(INT);
				}
				break;
			case T__130:
				enterOuterAlt(_localctx, 8);
				{
				setState(1179);
				match(T__130);
				setState(1180);
				match(INT);
				}
				break;
			case T__131:
				enterOuterAlt(_localctx, 9);
				{
				setState(1181);
				match(T__131);
				setState(1182);
				match(BOOLEAN);
				}
				break;
			case T__132:
				enterOuterAlt(_localctx, 10);
				{
				setState(1183);
				match(T__132);
				setState(1184);
				match(BOOLEAN);
				}
				break;
			case T__133:
				enterOuterAlt(_localctx, 11);
				{
				setState(1185);
				match(T__133);
				setState(1186);
				match(STRING);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 12);
				{
				setState(1187);
				eventBinding();
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
	public static class StylePropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(UIParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public StylePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterStyleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitStyleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitStyleProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylePropertyContext styleProperty() throws RecognitionException {
		StylePropertyContext _localctx = new StylePropertyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_styleProperty);
		try {
			setState(1202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__134:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				match(T__134);
				setState(1191);
				match(STRING);
				}
				break;
			case T__135:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(T__135);
				setState(1193);
				match(STRING);
				}
				break;
			case T__136:
				enterOuterAlt(_localctx, 3);
				{
				setState(1194);
				match(T__136);
				setState(1195);
				match(INT);
				}
				break;
			case T__137:
				enterOuterAlt(_localctx, 4);
				{
				setState(1196);
				match(T__137);
				setState(1197);
				match(FLOAT);
				}
				break;
			case T__138:
				enterOuterAlt(_localctx, 5);
				{
				setState(1198);
				match(T__138);
				setState(1199);
				match(BOOLEAN);
				}
				break;
			case T__139:
				enterOuterAlt(_localctx, 6);
				{
				setState(1200);
				match(T__139);
				setState(1201);
				match(STRING);
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
	public static class TreeViewPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public TreeViewPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeViewProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTreeViewProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTreeViewProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTreeViewProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreeViewPropertyContext treeViewProperty() throws RecognitionException {
		TreeViewPropertyContext _localctx = new TreeViewPropertyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_treeViewProperty);
		try {
			setState(1207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__140:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				match(T__140);
				setState(1205);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				eventBinding();
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
	public static class SpinnerPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public SpinnerPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spinnerProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterSpinnerProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitSpinnerProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitSpinnerProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpinnerPropertyContext spinnerProperty() throws RecognitionException {
		SpinnerPropertyContext _localctx = new SpinnerPropertyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_spinnerProperty);
		try {
			setState(1214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				match(T__97);
				setState(1210);
				match(BOOLEAN);
				}
				break;
			case T__141:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				match(T__141);
				setState(1212);
				match(INT);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(1213);
				eventBinding();
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
	public static class ColorPickerPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public ColorPickerPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorPickerProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterColorPickerProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitColorPickerProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitColorPickerProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorPickerPropertyContext colorPickerProperty() throws RecognitionException {
		ColorPickerPropertyContext _localctx = new ColorPickerPropertyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_colorPickerProperty);
		try {
			setState(1219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__142:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				match(T__142);
				setState(1217);
				match(STRING);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				eventBinding();
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
	public static class FileChooserPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public FileChooserPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileChooserProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterFileChooserProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitFileChooserProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitFileChooserProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileChooserPropertyContext fileChooserProperty() throws RecognitionException {
		FileChooserPropertyContext _localctx = new FileChooserPropertyContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_fileChooserProperty);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__143:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				match(T__143);
				setState(1222);
				match(STRING);
				}
				break;
			case T__144:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				match(T__144);
				setState(1224);
				stringList();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225);
				eventBinding();
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
	public static class MediaViewPropertyContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public MediaViewPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaViewProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterMediaViewProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitMediaViewProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitMediaViewProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaViewPropertyContext mediaViewProperty() throws RecognitionException {
		MediaViewPropertyContext _localctx = new MediaViewPropertyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_mediaViewProperty);
		try {
			setState(1235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__109:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				match(T__109);
				setState(1229);
				match(INT);
				}
				break;
			case T__110:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				match(T__110);
				setState(1231);
				match(INT);
				}
				break;
			case T__111:
				enterOuterAlt(_localctx, 3);
				{
				setState(1232);
				match(T__111);
				setState(1233);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 4);
				{
				setState(1234);
				eventBinding();
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
	public static class ScrollPanePropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public ScrollPanePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrollPaneProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterScrollPaneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitScrollPaneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitScrollPaneProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScrollPanePropertyContext scrollPaneProperty() throws RecognitionException {
		ScrollPanePropertyContext _localctx = new ScrollPanePropertyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_scrollPaneProperty);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__145:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				match(T__145);
				setState(1238);
				match(BOOLEAN);
				}
				break;
			case T__146:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				match(T__146);
				setState(1240);
				match(BOOLEAN);
				}
				break;
			case T__147:
				enterOuterAlt(_localctx, 3);
				{
				setState(1241);
				match(T__147);
				setState(1242);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243);
				eventBinding();
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
	public static class SplitPanePropertyContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT() { return getTokens(UIParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(UIParser.FLOAT, i);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public SplitPanePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitPaneProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterSplitPaneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitSplitPaneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitSplitPaneProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplitPanePropertyContext splitPaneProperty() throws RecognitionException {
		SplitPanePropertyContext _localctx = new SplitPanePropertyContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_splitPaneProperty);
		int _la;
		try {
			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__148:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				match(T__148);
				setState(1247);
				match(FLOAT);
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__149) {
					{
					{
					setState(1248);
					match(T__149);
					setState(1249);
					match(FLOAT);
					}
					}
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(1255);
				eventBinding();
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
	public static class TreeTableViewPropertyContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public TreeTableViewPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeTableViewProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterTreeTableViewProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitTreeTableViewProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitTreeTableViewProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreeTableViewPropertyContext treeTableViewProperty() throws RecognitionException {
		TreeTableViewPropertyContext _localctx = new TreeTableViewPropertyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_treeTableViewProperty);
		try {
			setState(1263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				match(T__97);
				setState(1259);
				match(BOOLEAN);
				}
				break;
			case T__140:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(T__140);
				setState(1261);
				match(BOOLEAN);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				eventBinding();
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
	public static class DialogPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public DialogTypeContext dialogType() {
			return getRuleContext(DialogTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(UIParser.BOOLEAN, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public DialogPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialogProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDialogProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDialogProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDialogProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DialogPropertyContext dialogProperty() throws RecognitionException {
		DialogPropertyContext _localctx = new DialogPropertyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dialogProperty);
		try {
			setState(1280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__150:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				match(T__150);
				setState(1266);
				match(STRING);
				}
				break;
			case T__151:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				match(T__151);
				setState(1268);
				match(STRING);
				}
				break;
			case T__152:
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
				match(T__152);
				setState(1270);
				match(STRING);
				}
				break;
			case T__121:
				enterOuterAlt(_localctx, 4);
				{
				setState(1271);
				match(T__121);
				setState(1272);
				dialogType();
				}
				break;
			case T__153:
				enterOuterAlt(_localctx, 5);
				{
				setState(1273);
				match(T__153);
				setState(1274);
				match(BOOLEAN);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(1275);
				match(T__5);
				setState(1276);
				match(BOOLEAN);
				}
				break;
			case T__154:
				enterOuterAlt(_localctx, 7);
				{
				setState(1277);
				match(T__154);
				setState(1278);
				stringList();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 8);
				{
				setState(1279);
				eventBinding();
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
	public static class ColumnListContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(UIParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UIParser.STRING, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(STRING);
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__149) {
				{
				{
				setState(1283);
				match(T__149);
				setState(1284);
				match(STRING);
				}
				}
				setState(1289);
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
		enterRule(_localctx, 156, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(STRING);
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__149) {
				{
				{
				setState(1291);
				match(T__149);
				setState(1292);
				match(STRING);
				}
				}
				setState(1297);
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
	public static class AlignmentTypeContext extends ParserRuleContext {
		public AlignmentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterAlignmentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitAlignmentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitAlignmentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentTypeContext alignmentType() throws RecognitionException {
		AlignmentTypeContext _localctx = new AlignmentTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_alignmentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			_la = _input.LA(1);
			if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & 31L) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_layoutType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			_la = _input.LA(1);
			if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 255L) != 0)) ) {
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
	public static class OrientationTypeContext extends ParserRuleContext {
		public OrientationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orientationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterOrientationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitOrientationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitOrientationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrientationTypeContext orientationType() throws RecognitionException {
		OrientationTypeContext _localctx = new OrientationTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_orientationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_la = _input.LA(1);
			if ( !(_la==T__168 || _la==T__169) ) {
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
	public static class SelectionModeTypeContext extends ParserRuleContext {
		public SelectionModeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionModeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterSelectionModeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitSelectionModeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitSelectionModeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionModeTypeContext selectionModeType() throws RecognitionException {
		SelectionModeTypeContext _localctx = new SelectionModeTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_selectionModeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_la = _input.LA(1);
			if ( !(_la==T__170 || _la==T__171) ) {
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
	public static class ModalityTypeContext extends ParserRuleContext {
		public ModalityTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalityType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterModalityType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitModalityType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitModalityType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModalityTypeContext modalityType() throws RecognitionException {
		ModalityTypeContext _localctx = new ModalityTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_modalityType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_la = _input.LA(1);
			if ( !(((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 7L) != 0)) ) {
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
	public static class StageStyleTypeContext extends ParserRuleContext {
		public StageStyleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stageStyleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterStageStyleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitStageStyleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitStageStyleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StageStyleTypeContext stageStyleType() throws RecognitionException {
		StageStyleTypeContext _localctx = new StageStyleTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_stageStyleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			_la = _input.LA(1);
			if ( !(((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & 31L) != 0)) ) {
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
	public static class DialogTypeContext extends ParserRuleContext {
		public DialogTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialogType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDialogType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDialogType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDialogType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DialogTypeContext dialogType() throws RecognitionException {
		DialogTypeContext _localctx = new DialogTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_dialogType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_la = _input.LA(1);
			if ( !(((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 3841L) != 0)) ) {
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
	public static class DataListContext extends ParserRuleContext {
		public List<DataPairContext> dataPair() {
			return getRuleContexts(DataPairContext.class);
		}
		public DataPairContext dataPair(int i) {
			return getRuleContext(DataPairContext.class,i);
		}
		public DataListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDataList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDataList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDataList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataListContext dataList() throws RecognitionException {
		DataListContext _localctx = new DataListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_dataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			match(T__41);
			setState(1313);
			dataPair();
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__149) {
				{
				{
				setState(1314);
				match(T__149);
				setState(1315);
				dataPair();
				}
				}
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1321);
			match(T__42);
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
	public static class DataPairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UIParser.STRING, 0); }
		public TerminalNode INT() { return getToken(UIParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(UIParser.FLOAT, 0); }
		public DataPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).enterDataPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UIListener ) ((UIListener)listener).exitDataPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UIVisitor ) return ((UIVisitor<? extends T>)visitor).visitDataPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataPairContext dataPair() throws RecognitionException {
		DataPairContext _localctx = new DataPairContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dataPair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(STRING);
			setState(1324);
			match(T__184);
			setState(1325);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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
		"\u0004\u0001\u00c1\u0530\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0001\u0000\u0005\u0000\u00b2"+
		"\b\u0000\n\u0000\f\u0000\u00b5\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00be\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00cc\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00d3\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00d7\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00db\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00df\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0104\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0109\b\u0006\n\u0006\f\u0006\u010c\t\u0006"+
		"\u0001\u0006\u0005\u0006\u010f\b\u0006\n\u0006\f\u0006\u0112\t\u0006\u0001"+
		"\u0006\u0005\u0006\u0115\b\u0006\n\u0006\f\u0006\u0118\t\u0006\u0001\u0006"+
		"\u0005\u0006\u011b\b\u0006\n\u0006\f\u0006\u011e\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0124\b\u0007\n\u0007\f\u0007"+
		"\u0127\t\u0007\u0001\u0007\u0005\u0007\u012a\b\u0007\n\u0007\f\u0007\u012d"+
		"\t\u0007\u0001\u0007\u0005\u0007\u0130\b\u0007\n\u0007\f\u0007\u0133\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0139\b\b\n\b\f\b\u013c"+
		"\t\b\u0001\b\u0005\b\u013f\b\b\n\b\f\b\u0142\t\b\u0001\b\u0005\b\u0145"+
		"\b\b\n\b\f\b\u0148\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u014e\b"+
		"\t\n\t\f\t\u0151\t\t\u0001\t\u0005\t\u0154\b\t\n\t\f\t\u0157\t\t\u0001"+
		"\t\u0005\t\u015a\b\t\n\t\f\t\u015d\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u0164\b\n\n\n\f\n\u0167\t\n\u0001\n\u0005\n\u016a\b\n"+
		"\n\n\f\n\u016d\t\n\u0001\n\u0005\n\u0170\b\n\n\n\f\n\u0173\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u017b\b\u000b\n\u000b\f\u000b\u017e\t\u000b\u0001\u000b\u0005\u000b\u0181"+
		"\b\u000b\n\u000b\f\u000b\u0184\t\u000b\u0001\u000b\u0005\u000b\u0187\b"+
		"\u000b\n\u000b\f\u000b\u018a\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0190\b\f\u0001\f\u0005\f\u0193\b\f\n\f\f\f\u0196\t\f\u0001\f\u0005"+
		"\f\u0199\b\f\n\f\f\f\u019c\t\f\u0001\f\u0005\f\u019f\b\f\n\f\f\f\u01a2"+
		"\t\f\u0001\f\u0005\f\u01a5\b\f\n\f\f\f\u01a8\t\f\u0001\f\u0005\f\u01ab"+
		"\b\f\n\f\f\f\u01ae\t\f\u0001\f\u0005\f\u01b1\b\f\n\f\f\f\u01b4\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u01ba\b\r\n\r\f\r\u01bd\t\r\u0001\r"+
		"\u0005\r\u01c0\b\r\n\r\f\r\u01c3\t\r\u0001\r\u0005\r\u01c6\b\r\n\r\f\r"+
		"\u01c9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u01d5\b\u000e\n\u000e\f\u000e\u01d8\t\u000e\u0001\u000e\u0005\u000e\u01db"+
		"\b\u000e\n\u000e\f\u000e\u01de\t\u000e\u0001\u000e\u0005\u000e\u01e1\b"+
		"\u000e\n\u000e\f\u000e\u01e4\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01ec\b\u000f\n\u000f"+
		"\f\u000f\u01ef\t\u000f\u0001\u000f\u0005\u000f\u01f2\b\u000f\n\u000f\f"+
		"\u000f\u01f5\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u01fd\b\u0010\n\u0010\f\u0010\u0200\t\u0010"+
		"\u0001\u0010\u0005\u0010\u0203\b\u0010\n\u0010\f\u0010\u0206\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u020d"+
		"\b\u0011\n\u0011\f\u0011\u0210\t\u0011\u0001\u0011\u0005\u0011\u0213\b"+
		"\u0011\n\u0011\f\u0011\u0216\t\u0011\u0001\u0011\u0005\u0011\u0219\b\u0011"+
		"\n\u0011\f\u0011\u021c\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0224\b\u0012\n\u0012\f\u0012"+
		"\u0227\t\u0012\u0001\u0012\u0005\u0012\u022a\b\u0012\n\u0012\f\u0012\u022d"+
		"\t\u0012\u0001\u0012\u0005\u0012\u0230\b\u0012\n\u0012\f\u0012\u0233\t"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0238\b\u0013\n"+
		"\u0013\f\u0013\u023b\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0241\b\u0014\n\u0014\f\u0014\u0244\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u024a\b\u0015\n\u0015"+
		"\f\u0015\u024d\t\u0015\u0001\u0015\u0005\u0015\u0250\b\u0015\n\u0015\f"+
		"\u0015\u0253\t\u0015\u0001\u0015\u0005\u0015\u0256\b\u0015\n\u0015\f\u0015"+
		"\u0259\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u025f\b\u0016\n\u0016\f\u0016\u0262\t\u0016\u0001\u0016\u0005\u0016\u0265"+
		"\b\u0016\n\u0016\f\u0016\u0268\t\u0016\u0001\u0016\u0005\u0016\u026b\b"+
		"\u0016\n\u0016\f\u0016\u026e\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u0273\b\u0017\u000b\u0017\f\u0017\u0274\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0279\b\u0017\n\u0017\f\u0017\u027c\t\u0017\u0001\u0017"+
		"\u0005\u0017\u027f\b\u0017\n\u0017\f\u0017\u0282\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u0288\b\u0018\u000b\u0018\f"+
		"\u0018\u0289\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0004\u0019\u0291\b\u0019\u000b\u0019\f\u0019\u0292\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0297\b\u0019\n\u0019\f\u0019\u029a\t\u0019\u0001\u0019"+
		"\u0005\u0019\u029d\b\u0019\n\u0019\f\u0019\u02a0\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u02a6\b\u001a\u000b\u001a\f"+
		"\u001a\u02a7\u0001\u001a\u0001\u001a\u0005\u001a\u02ac\b\u001a\n\u001a"+
		"\f\u001a\u02af\t\u001a\u0001\u001a\u0005\u001a\u02b2\b\u001a\n\u001a\f"+
		"\u001a\u02b5\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u02bb\b\u001b\n\u001b\f\u001b\u02be\t\u001b\u0001\u001b\u0005\u001b"+
		"\u02c1\b\u001b\n\u001b\f\u001b\u02c4\t\u001b\u0001\u001b\u0005\u001b\u02c7"+
		"\b\u001b\n\u001b\f\u001b\u02ca\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u02d4\b\u001c\n\u001c\f\u001c\u02d7\t\u001c\u0001\u001c\u0005\u001c\u02da"+
		"\b\u001c\n\u001c\f\u001c\u02dd\t\u001c\u0001\u001c\u0005\u001c\u02e0\b"+
		"\u001c\n\u001c\f\u001c\u02e3\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u02e9\b\u001d\n\u001d\f\u001d\u02ec\t\u001d\u0001"+
		"\u001d\u0005\u001d\u02ef\b\u001d\n\u001d\f\u001d\u02f2\t\u001d\u0001\u001d"+
		"\u0005\u001d\u02f5\b\u001d\n\u001d\f\u001d\u02f8\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0300"+
		"\b\u001e\n\u001e\f\u001e\u0303\t\u001e\u0001\u001e\u0005\u001e\u0306\b"+
		"\u001e\n\u001e\f\u001e\u0309\t\u001e\u0001\u001e\u0005\u001e\u030c\b\u001e"+
		"\n\u001e\f\u001e\u030f\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0317\b\u001f\n\u001f\f\u001f"+
		"\u031a\t\u001f\u0001\u001f\u0005\u001f\u031d\b\u001f\n\u001f\f\u001f\u0320"+
		"\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u032a\b \n \f \u032d\t \u0001 \u0005 \u0330\b \n \f \u0333\t \u0001"+
		"!\u0001!\u0001!\u0001!\u0005!\u0339\b!\n!\f!\u033c\t!\u0001!\u0005!\u033f"+
		"\b!\n!\f!\u0342\t!\u0001!\u0005!\u0345\b!\n!\f!\u0348\t!\u0001\"\u0001"+
		"\"\u0001\"\u0004\"\u034d\b\"\u000b\"\f\"\u034e\u0001\"\u0001\"\u0005\""+
		"\u0353\b\"\n\"\f\"\u0356\t\"\u0001\"\u0005\"\u0359\b\"\n\"\f\"\u035c\t"+
		"\"\u0001\"\u0005\"\u035f\b\"\n\"\f\"\u0362\t\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0004#\u0369\b#\u000b#\f#\u036a\u0001#\u0001#\u0005#\u036f\b"+
		"#\n#\f#\u0372\t#\u0001#\u0005#\u0375\b#\n#\f#\u0378\t#\u0001#\u0005#\u037b"+
		"\b#\n#\f#\u037e\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0386"+
		"\b$\n$\f$\u0389\t$\u0001$\u0005$\u038c\b$\n$\f$\u038f\t$\u0001$\u0005"+
		"$\u0392\b$\n$\f$\u0395\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u039c"+
		"\b%\n%\f%\u039f\t%\u0001%\u0005%\u03a2\b%\n%\f%\u03a5\t%\u0001%\u0005"+
		"%\u03a8\b%\n%\f%\u03ab\t%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u03b6\b&\n&\f&\u03b9\t&\u0001&\u0005&\u03bc\b&"+
		"\n&\f&\u03bf\t&\u0001&\u0005&\u03c2\b&\n&\f&\u03c5\t&\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u03d2\b)\u0001)\u0001)\u0003)\u03d6\b)\u0001)\u0001)\u0003)\u03da\b"+
		")\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u03ea\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u03f5\b.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0402"+
		"\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00030\u0413\b0\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u041a\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u0423\b2\u00013\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u042b\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0434"+
		"\b4\u00015\u00015\u00015\u00015\u00015\u00035\u043b\b5\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u0443\b6\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u044e\b7\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u0458\b9\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0003:\u045f\b:\u0001;\u0001;\u0001;\u0003;\u0464\b;\u0001<\u0004"+
		"<\u0467\b<\u000b<\f<\u0468\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u0475\b>\u0001?\u0001?\u0001?\u0003?\u047a"+
		"\b?\u0001@\u0001@\u0001@\u0001@\u0005@\u0480\b@\n@\f@\u0483\t@\u0001A"+
		"\u0001A\u0001A\u0001A\u0005A\u0489\bA\nA\fA\u048c\tA\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0003B\u04a5\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u04b3\bC\u0001D\u0001D\u0001D\u0003"+
		"D\u04b8\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u04bf\bE\u0001F\u0001"+
		"F\u0001F\u0003F\u04c4\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u04cb"+
		"\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u04d4\bH\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u04dd\bI\u0001J\u0001"+
		"J\u0001J\u0001J\u0005J\u04e3\bJ\nJ\fJ\u04e6\tJ\u0001J\u0003J\u04e9\bJ"+
		"\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u04f0\bK\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0003L\u0501\bL\u0001M\u0001M\u0001M\u0005M\u0506\bM\n"+
		"M\fM\u0509\tM\u0001N\u0001N\u0001N\u0005N\u050e\bN\nN\fN\u0511\tN\u0001"+
		"O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001"+
		"T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0005V\u0525\bV\nV"+
		"\fV\u0528\tV\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0001W\u0000\u0000"+
		"X\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u0000\u000b"+
		"\u0001\u0000@B\u0001\u0000IL\u0001\u0000NR\u0001\u0000\u009c\u00a0\u0001"+
		"\u0000\u00a1\u00a8\u0001\u0000\u00a9\u00aa\u0001\u0000\u00ab\u00ac\u0001"+
		"\u0000\u00ad\u00af\u0001\u0000\u00b0\u00b4\u0002\u0000\u00ad\u00ad\u00b5"+
		"\u00b8\u0001\u0000\u00bd\u00be\u05c0\u0000\u00b3\u0001\u0000\u0000\u0000"+
		"\u0002\u00bd\u0001\u0000\u0000\u0000\u0004\u00bf\u0001\u0000\u0000\u0000"+
		"\u0006\u00c2\u0001\u0000\u0000\u0000\b\u00e0\u0001\u0000\u0000\u0000\n"+
		"\u0103\u0001\u0000\u0000\u0000\f\u0105\u0001\u0000\u0000\u0000\u000e\u011f"+
		"\u0001\u0000\u0000\u0000\u0010\u0134\u0001\u0000\u0000\u0000\u0012\u0149"+
		"\u0001\u0000\u0000\u0000\u0014\u015e\u0001\u0000\u0000\u0000\u0016\u0174"+
		"\u0001\u0000\u0000\u0000\u0018\u018b\u0001\u0000\u0000\u0000\u001a\u01b5"+
		"\u0001\u0000\u0000\u0000\u001c\u01ca\u0001\u0000\u0000\u0000\u001e\u01e5"+
		"\u0001\u0000\u0000\u0000 \u01f6\u0001\u0000\u0000\u0000\"\u0207\u0001"+
		"\u0000\u0000\u0000$\u021d\u0001\u0000\u0000\u0000&\u0234\u0001\u0000\u0000"+
		"\u0000(\u023c\u0001\u0000\u0000\u0000*\u0245\u0001\u0000\u0000\u0000,"+
		"\u025a\u0001\u0000\u0000\u0000.\u026f\u0001\u0000\u0000\u00000\u0283\u0001"+
		"\u0000\u0000\u00002\u028d\u0001\u0000\u0000\u00004\u02a1\u0001\u0000\u0000"+
		"\u00006\u02b6\u0001\u0000\u0000\u00008\u02cb\u0001\u0000\u0000\u0000:"+
		"\u02e4\u0001\u0000\u0000\u0000<\u02f9\u0001\u0000\u0000\u0000>\u0310\u0001"+
		"\u0000\u0000\u0000@\u0321\u0001\u0000\u0000\u0000B\u0334\u0001\u0000\u0000"+
		"\u0000D\u0349\u0001\u0000\u0000\u0000F\u0363\u0001\u0000\u0000\u0000H"+
		"\u037f\u0001\u0000\u0000\u0000J\u0396\u0001\u0000\u0000\u0000L\u03ac\u0001"+
		"\u0000\u0000\u0000N\u03c6\u0001\u0000\u0000\u0000P\u03c8\u0001\u0000\u0000"+
		"\u0000R\u03cd\u0001\u0000\u0000\u0000T\u03db\u0001\u0000\u0000\u0000V"+
		"\u03dd\u0001\u0000\u0000\u0000X\u03e0\u0001\u0000\u0000\u0000Z\u03e9\u0001"+
		"\u0000\u0000\u0000\\\u03f4\u0001\u0000\u0000\u0000^\u0401\u0001\u0000"+
		"\u0000\u0000`\u0412\u0001\u0000\u0000\u0000b\u0419\u0001\u0000\u0000\u0000"+
		"d\u0422\u0001\u0000\u0000\u0000f\u042a\u0001\u0000\u0000\u0000h\u0433"+
		"\u0001\u0000\u0000\u0000j\u043a\u0001\u0000\u0000\u0000l\u0442\u0001\u0000"+
		"\u0000\u0000n\u044d\u0001\u0000\u0000\u0000p\u044f\u0001\u0000\u0000\u0000"+
		"r\u0457\u0001\u0000\u0000\u0000t\u045e\u0001\u0000\u0000\u0000v\u0463"+
		"\u0001\u0000\u0000\u0000x\u0466\u0001\u0000\u0000\u0000z\u046a\u0001\u0000"+
		"\u0000\u0000|\u0474\u0001\u0000\u0000\u0000~\u0479\u0001\u0000\u0000\u0000"+
		"\u0080\u047b\u0001\u0000\u0000\u0000\u0082\u0484\u0001\u0000\u0000\u0000"+
		"\u0084\u04a4\u0001\u0000\u0000\u0000\u0086\u04b2\u0001\u0000\u0000\u0000"+
		"\u0088\u04b7\u0001\u0000\u0000\u0000\u008a\u04be\u0001\u0000\u0000\u0000"+
		"\u008c\u04c3\u0001\u0000\u0000\u0000\u008e\u04ca\u0001\u0000\u0000\u0000"+
		"\u0090\u04d3\u0001\u0000\u0000\u0000\u0092\u04dc\u0001\u0000\u0000\u0000"+
		"\u0094\u04e8\u0001\u0000\u0000\u0000\u0096\u04ef\u0001\u0000\u0000\u0000"+
		"\u0098\u0500\u0001\u0000\u0000\u0000\u009a\u0502\u0001\u0000\u0000\u0000"+
		"\u009c\u050a\u0001\u0000\u0000\u0000\u009e\u0512\u0001\u0000\u0000\u0000"+
		"\u00a0\u0514\u0001\u0000\u0000\u0000\u00a2\u0516\u0001\u0000\u0000\u0000"+
		"\u00a4\u0518\u0001\u0000\u0000\u0000\u00a6\u051a\u0001\u0000\u0000\u0000"+
		"\u00a8\u051c\u0001\u0000\u0000\u0000\u00aa\u051e\u0001\u0000\u0000\u0000"+
		"\u00ac\u0520\u0001\u0000\u0000\u0000\u00ae\u052b\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0003\u0002\u0001\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0000\u0000\u0001"+
		"\u00b7\u0001\u0001\u0000\u0000\u0000\u00b8\u00be\u0003\u0006\u0003\u0000"+
		"\u00b9\u00be\u0003\b\u0004\u0000\u00ba\u00be\u0003\u0080@\u0000\u00bb"+
		"\u00be\u0003\u0082A\u0000\u00bc\u00be\u0003\u0004\u0002\u0000\u00bd\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00bd\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u0003\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0001\u0000\u0000\u00c0\u00c1\u0005\u00ba\u0000\u0000\u00c1\u0005"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0002\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005\u00ba\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0004\u0000\u0000\u00c6\u00c7\u0005\u00bd\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0005\u0000\u0000\u00c8\u00cb\u0005\u00bd\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0006\u0000\u0000\u00ca\u00cc\u0005\u00bb\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d2"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0007\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0005\u0000\u0000\u00cf\u00d0\u0005\u00bd\u0000\u0000\u00d0\u00d1"+
		"\u0005\b\u0000\u0000\u00d1\u00d3\u0005\u00bd\u0000\u0000\u00d2\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\t\u0000\u0000\u00d5\u00d7\u0003\u00a6"+
		"S\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000"+
		"\u00d9\u00db\u0003\u00a8T\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u000b\u0000\u0000\u00dd\u00df\u0003\u00a0P\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u0007"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\f\u0000\u0000\u00e1\u00e2\u0003"+
		"\n\u0005\u0000\u00e2\t\u0001\u0000\u0000\u0000\u00e3\u0104\u0003\f\u0006"+
		"\u0000\u00e4\u0104\u0003\u000e\u0007\u0000\u00e5\u0104\u0003\u0010\b\u0000"+
		"\u00e6\u0104\u0003\u0012\t\u0000\u00e7\u0104\u0003\u0014\n\u0000\u00e8"+
		"\u0104\u0003\u0016\u000b\u0000\u00e9\u0104\u0003\u0018\f\u0000\u00ea\u0104"+
		"\u0003\u001a\r\u0000\u00eb\u0104\u0003\u001c\u000e\u0000\u00ec\u0104\u0003"+
		"\u001e\u000f\u0000\u00ed\u0104\u0003 \u0010\u0000\u00ee\u0104\u0003\""+
		"\u0011\u0000\u00ef\u0104\u0003$\u0012\u0000\u00f0\u0104\u0003&\u0013\u0000"+
		"\u00f1\u0104\u0003(\u0014\u0000\u00f2\u0104\u0003*\u0015\u0000\u00f3\u0104"+
		"\u0003,\u0016\u0000\u00f4\u0104\u0003.\u0017\u0000\u00f5\u0104\u00032"+
		"\u0019\u0000\u00f6\u0104\u00034\u001a\u0000\u00f7\u0104\u00036\u001b\u0000"+
		"\u00f8\u0104\u00038\u001c\u0000\u00f9\u0104\u0003:\u001d\u0000\u00fa\u0104"+
		"\u0003<\u001e\u0000\u00fb\u0104\u0003>\u001f\u0000\u00fc\u0104\u0003@"+
		" \u0000\u00fd\u0104\u0003B!\u0000\u00fe\u0104\u0003D\"\u0000\u00ff\u0104"+
		"\u0003F#\u0000\u0100\u0104\u0003H$\u0000\u0101\u0104\u0003J%\u0000\u0102"+
		"\u0104\u0003L&\u0000\u0103\u00e3\u0001\u0000\u0000\u0000\u0103\u00e4\u0001"+
		"\u0000\u0000\u0000\u0103\u00e5\u0001\u0000\u0000\u0000\u0103\u00e6\u0001"+
		"\u0000\u0000\u0000\u0103\u00e7\u0001\u0000\u0000\u0000\u0103\u00e8\u0001"+
		"\u0000\u0000\u0000\u0103\u00e9\u0001\u0000\u0000\u0000\u0103\u00ea\u0001"+
		"\u0000\u0000\u0000\u0103\u00eb\u0001\u0000\u0000\u0000\u0103\u00ec\u0001"+
		"\u0000\u0000\u0000\u0103\u00ed\u0001\u0000\u0000\u0000\u0103\u00ee\u0001"+
		"\u0000\u0000\u0000\u0103\u00ef\u0001\u0000\u0000\u0000\u0103\u00f0\u0001"+
		"\u0000\u0000\u0000\u0103\u00f1\u0001\u0000\u0000\u0000\u0103\u00f2\u0001"+
		"\u0000\u0000\u0000\u0103\u00f3\u0001\u0000\u0000\u0000\u0103\u00f4\u0001"+
		"\u0000\u0000\u0000\u0103\u00f5\u0001\u0000\u0000\u0000\u0103\u00f6\u0001"+
		"\u0000\u0000\u0000\u0103\u00f7\u0001\u0000\u0000\u0000\u0103\u00f8\u0001"+
		"\u0000\u0000\u0000\u0103\u00f9\u0001\u0000\u0000\u0000\u0103\u00fa\u0001"+
		"\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u00fc\u0001"+
		"\u0000\u0000\u0000\u0103\u00fd\u0001\u0000\u0000\u0000\u0103\u00fe\u0001"+
		"\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u000b\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\r\u0000\u0000\u0106\u010a\u0005\u00ba\u0000\u0000\u0107\u0109\u0003^"+
		"/\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u0110\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0003\u0084B\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0116\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0115\u0003R)\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011c"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011b"+
		"\u0003P(\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\r\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005\u000e\u0000\u0000\u0120\u0121\u0005\u000f\u0000"+
		"\u0000\u0121\u0125\u0005\u00bc\u0000\u0000\u0122\u0124\u0003`0\u0000\u0123"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u012b\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0003\u0084B\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u0131\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u0130\u0003P(\u0000\u012f\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u000f\u0001\u0000"+
		"\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0010"+
		"\u0000\u0000\u0135\u0136\u0005\u000f\u0000\u0000\u0136\u013a\u0005\u00bc"+
		"\u0000\u0000\u0137\u0139\u0003b1\u0000\u0138\u0137\u0001\u0000\u0000\u0000"+
		"\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0140\u0001\u0000\u0000\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013f\u0003\u0084B\u0000\u013e"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"\u0146\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0145\u0003P(\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001"+
		"\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0011\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0005\u0011\u0000\u0000\u014a\u014b\u0005"+
		"\u000f\u0000\u0000\u014b\u014f\u0005\u00bc\u0000\u0000\u014c\u014e\u0003"+
		"d2\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0155\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0003\u0084B\u0000\u0153\u0152\u0001\u0000\u0000\u0000"+
		"\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u015b\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0003P(\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u0013"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0005\u0012\u0000\u0000\u015f\u0160\u0005\u00ba\u0000\u0000\u0160\u0161"+
		"\u0005\u000f\u0000\u0000\u0161\u0165\u0005\u00bc\u0000\u0000\u0162\u0164"+
		"\u0003f3\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000"+
		"\u0000\u0000\u0166\u016b\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0168\u016a\u0003\u0084B\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u0171\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0170\u0003P(\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0015\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0005\u0013\u0000\u0000\u0175\u0176\u0005\u000f\u0000\u0000\u0176"+
		"\u0177\u0005\u00bc\u0000\u0000\u0177\u0178\u0005\u0014\u0000\u0000\u0178"+
		"\u017c\u0003\u009cN\u0000\u0179\u017b\u0003h4\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0182\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0181\u0003"+
		"\u0084B\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0188\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0003P(\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0017\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0015\u0000\u0000"+
		"\u018c\u018d\u0005\u00ba\u0000\u0000\u018d\u018f\u0005\u0016\u0000\u0000"+
		"\u018e\u0190\u0003Z-\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0194\u0001\u0000\u0000\u0000\u0191\u0193"+
		"\u0003j5\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000"+
		"\u0000\u0000\u0195\u019a\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0197\u0199\u0003\u0084B\u0000\u0198\u0197\u0001\u0000\u0000"+
		"\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u01a0\u0001\u0000\u0000"+
		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u019f\u0003R)\u0000\u019e"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a5\u0003V+\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u01ac\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0003R)\u0000\u01aa\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01b2\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b1\u0003P(\u0000\u01b0"+
		"\u01af\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u0019\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0005\u0017\u0000\u0000\u01b6\u01b7\u0005\u0018\u0000\u0000\u01b7"+
		"\u01bb\u0005\u00ba\u0000\u0000\u01b8\u01ba\u0003l6\u0000\u01b9\u01b8\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01c1\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c0\u0003"+
		"\u0084B\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c7\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c6\u0003R)\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u001b\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\u0019\u0000\u0000"+
		"\u01cb\u01cc\u0005\u000f\u0000\u0000\u01cc\u01cd\u0005\u00bc\u0000\u0000"+
		"\u01cd\u01ce\u0005\u001a\u0000\u0000\u01ce\u01cf\u0005\u00bd\u0000\u0000"+
		"\u01cf\u01d0\u0005\u001b\u0000\u0000\u01d0\u01d1\u0005\u00bd\u0000\u0000"+
		"\u01d1\u01d2\u0005\u001c\u0000\u0000\u01d2\u01d6\u0005\u00bd\u0000\u0000"+
		"\u01d3\u01d5\u0003n7\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01dc\u0001\u0000\u0000\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0003\u0084B\u0000\u01da\u01d9\u0001"+
		"\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e2\u0001"+
		"\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1\u0003"+
		"P(\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e3\u001d\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\u0005\u001d\u0000\u0000\u01e6\u01e7\u0005\u000f\u0000"+
		"\u0000\u01e7\u01e8\u0005\u00bc\u0000\u0000\u01e8\u01e9\u0005\u001e\u0000"+
		"\u0000\u01e9\u01ed\u0005\u00be\u0000\u0000\u01ea\u01ec\u0003p8\u0000\u01eb"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee"+
		"\u01f3\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f2\u0003\u0084B\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4\u001f\u0001\u0000\u0000\u0000\u01f5\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u001f\u0000\u0000\u01f7\u01f8"+
		"\u0005\u000f\u0000\u0000\u01f8\u01f9\u0005\u00bc\u0000\u0000\u01f9\u01fa"+
		"\u0005 \u0000\u0000\u01fa\u01fe\u0003\u009aM\u0000\u01fb\u01fd\u0003r"+
		"9\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u0204\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0201\u0203\u0003\u0084B\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205!\u0001\u0000\u0000\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u0005!\u0000\u0000\u0208\u0209"+
		"\u0005\u00ba\u0000\u0000\u0209\u020a\u0005\u000f\u0000\u0000\u020a\u020e"+
		"\u0005\u00bc\u0000\u0000\u020b\u020d\u0003t:\u0000\u020c\u020b\u0001\u0000"+
		"\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0214\u0001\u0000"+
		"\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0213\u0003\u0084"+
		"B\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000"+
		"\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u021a\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0217\u0219\u0003P(\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0219"+
		"\u021c\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a"+
		"\u021b\u0001\u0000\u0000\u0000\u021b#\u0001\u0000\u0000\u0000\u021c\u021a"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0005\"\u0000\u0000\u021e\u021f\u0005"+
		"\u000f\u0000\u0000\u021f\u0220\u0005\u00bc\u0000\u0000\u0220\u0221\u0005"+
		"#\u0000\u0000\u0221\u0225\u0003\u009cN\u0000\u0222\u0224\u0003v;\u0000"+
		"\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u022b\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000"+
		"\u0228\u022a\u0003\u0084B\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022a"+
		"\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u0231\u0001\u0000\u0000\u0000\u022d"+
		"\u022b\u0001\u0000\u0000\u0000\u022e\u0230\u0003P(\u0000\u022f\u022e\u0001"+
		"\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232%\u0001\u0000"+
		"\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0235\u0005$\u0000"+
		"\u0000\u0235\u0239\u0003x<\u0000\u0236\u0238\u0003\u0084B\u0000\u0237"+
		"\u0236\u0001\u0000\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239"+
		"\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a"+
		"\'\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0005%\u0000\u0000\u023d\u023e\u0005#\u0000\u0000\u023e\u0242\u0003\u009c"+
		"N\u0000\u023f\u0241\u0003\u0084B\u0000\u0240\u023f\u0001\u0000\u0000\u0000"+
		"\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243)\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0245\u0246\u0005&\u0000\u0000\u0246\u0247"+
		"\u0005\u000f\u0000\u0000\u0247\u024b\u0005\u00bc\u0000\u0000\u0248\u024a"+
		"\u0003|>\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000"+
		"\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000"+
		"\u0000\u0000\u024c\u0251\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024e\u0250\u0003\u0084B\u0000\u024f\u024e\u0001\u0000\u0000"+
		"\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0257\u0001\u0000\u0000"+
		"\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0256\u0003P(\u0000\u0255"+
		"\u0254\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000\u0000\u0257"+
		"\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"+\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0005\'\u0000\u0000\u025b\u025c\u0005(\u0000\u0000\u025c\u0260\u0005"+
		"\u00ba\u0000\u0000\u025d\u025f\u0003~?\u0000\u025e\u025d\u0001\u0000\u0000"+
		"\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0266\u0001\u0000\u0000"+
		"\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0265\u0003\u0084B\u0000"+
		"\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000"+
		"\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267\u026c\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000"+
		"\u0269\u026b\u0003P(\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026e"+
		"\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0001\u0000\u0000\u0000\u026d-\u0001\u0000\u0000\u0000\u026e\u026c\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0005)\u0000\u0000\u0270\u0272\u0005*\u0000"+
		"\u0000\u0271\u0273\u00030\u0018\u0000\u0272\u0271\u0001\u0000\u0000\u0000"+
		"\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u027a\u0005+\u0000\u0000\u0277\u0279\u0003\u0084B\u0000\u0278\u0277"+
		"\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u0280"+
		"\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u027f"+
		"\u0003P(\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000"+
		"\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000"+
		"\u0000\u0000\u0281/\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0005,\u0000\u0000\u0284\u0285\u0005\u00ba\u0000\u0000"+
		"\u0285\u0287\u0005*\u0000\u0000\u0286\u0288\u0003\n\u0005\u0000\u0287"+
		"\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0005+\u0000\u0000\u028c1\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\u0005-\u0000\u0000\u028e\u0290\u0005*\u0000"+
		"\u0000\u028f\u0291\u00034\u001a\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000"+
		"\u0294\u0298\u0005+\u0000\u0000\u0295\u0297\u0003\u0084B\u0000\u0296\u0295"+
		"\u0001\u0000\u0000\u0000\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296"+
		"\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029e"+
		"\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029b\u029d"+
		"\u0003P(\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000"+
		"\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000"+
		"\u0000\u0000\u029f3\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0005.\u0000\u0000\u02a2\u02a3\u0005\u00ba\u0000\u0000"+
		"\u02a3\u02a5\u0005*\u0000\u0000\u02a4\u02a6\u0003\n\u0005\u0000\u02a5"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ad\u0005+\u0000\u0000\u02aa\u02ac"+
		"\u0003\u0084B\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ac\u02af\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001"+
		"\u0000\u0000\u0000\u02ae\u02b3\u0001\u0000\u0000\u0000\u02af\u02ad\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b2\u0003P(\u0000\u02b1\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b45\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005/\u0000\u0000\u02b7"+
		"\u02b8\u0005\u000f\u0000\u0000\u02b8\u02bc\u0005\u00bc\u0000\u0000\u02b9"+
		"\u02bb\u0003\u0088D\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb\u02be"+
		"\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bd\u02c2\u0001\u0000\u0000\u0000\u02be\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c1\u0003\u0084B\u0000\u02c0\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c7\u0003"+
		"P(\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c7\u02ca\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c97\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u00050\u0000\u0000\u02cc\u02cd\u0005\u000f\u0000\u0000\u02cd"+
		"\u02ce\u0005\u00bc\u0000\u0000\u02ce\u02cf\u0005\u001a\u0000\u0000\u02cf"+
		"\u02d0\u0005\u00bd\u0000\u0000\u02d0\u02d1\u0005\u001b\u0000\u0000\u02d1"+
		"\u02d5\u0005\u00bd\u0000\u0000\u02d2\u02d4\u0003\u008aE\u0000\u02d3\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000\u02d5\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02db"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d8\u02da"+
		"\u0003\u0084B\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02da\u02dd\u0001"+
		"\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
		"\u0000\u0000\u0000\u02dc\u02e1\u0001\u0000\u0000\u0000\u02dd\u02db\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0003P(\u0000\u02df\u02de\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e29\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4\u02e5\u00051\u0000\u0000\u02e5"+
		"\u02e6\u0005\u000f\u0000\u0000\u02e6\u02ea\u0005\u00bc\u0000\u0000\u02e7"+
		"\u02e9\u0003\u008cF\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02f0\u0001\u0000\u0000\u0000\u02ec\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ed\u02ef\u0003\u0084B\u0000\u02ee\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f5\u0003"+
		"P(\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f7;\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000"+
		"\u02f9\u02fa\u00052\u0000\u0000\u02fa\u02fb\u0005\u000f\u0000\u0000\u02fb"+
		"\u02fc\u0005\u00bc\u0000\u0000\u02fc\u02fd\u00053\u0000\u0000\u02fd\u0301"+
		"\u0005\u00ba\u0000\u0000\u02fe\u0300\u0003\u008eG\u0000\u02ff\u02fe\u0001"+
		"\u0000\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301\u02ff\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0307\u0001"+
		"\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u0306\u0003"+
		"\u0084B\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0306\u0309\u0001\u0000"+
		"\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000"+
		"\u0000\u0000\u0308\u030d\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000"+
		"\u0000\u0000\u030a\u030c\u0003P(\u0000\u030b\u030a\u0001\u0000\u0000\u0000"+
		"\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000"+
		"\u030d\u030e\u0001\u0000\u0000\u0000\u030e=\u0001\u0000\u0000\u0000\u030f"+
		"\u030d\u0001\u0000\u0000\u0000\u0310\u0311\u00054\u0000\u0000\u0311\u0312"+
		"\u0005\u000f\u0000\u0000\u0312\u0313\u0005\u00bc\u0000\u0000\u0313\u0314"+
		"\u00053\u0000\u0000\u0314\u0318\u0005\u00ba\u0000\u0000\u0315\u0317\u0003"+
		"\u0084B\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000"+
		"\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000"+
		"\u0000\u0000\u0319\u031e\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000"+
		"\u0000\u0000\u031b\u031d\u0003P(\u0000\u031c\u031b\u0001\u0000\u0000\u0000"+
		"\u031d\u0320\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0001\u0000\u0000\u0000\u031f?\u0001\u0000\u0000\u0000\u0320"+
		"\u031e\u0001\u0000\u0000\u0000\u0321\u0322\u00055\u0000\u0000\u0322\u0323"+
		"\u0005\u000f\u0000\u0000\u0323\u0324\u0005\u00bc\u0000\u0000\u0324\u0325"+
		"\u00056\u0000\u0000\u0325\u0326\u0005\u00bd\u0000\u0000\u0326\u0327\u0005"+
		"7\u0000\u0000\u0327\u032b\u0005\u00bd\u0000\u0000\u0328\u032a\u0003\u0084"+
		"B\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u032a\u032d\u0001\u0000\u0000"+
		"\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000"+
		"\u0000\u032c\u0331\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000"+
		"\u0000\u032e\u0330\u0003P(\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u0330"+
		"\u0333\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0331"+
		"\u0332\u0001\u0000\u0000\u0000\u0332A\u0001\u0000\u0000\u0000\u0333\u0331"+
		"\u0001\u0000\u0000\u0000\u0334\u0335\u00058\u0000\u0000\u0335\u0336\u0005"+
		"\u0018\u0000\u0000\u0336\u033a\u0005\u00ba\u0000\u0000\u0337\u0339\u0003"+
		"\u0090H\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0339\u033c\u0001\u0000"+
		"\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000"+
		"\u0000\u0000\u033b\u0340\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000"+
		"\u0000\u0000\u033d\u033f\u0003\u0084B\u0000\u033e\u033d\u0001\u0000\u0000"+
		"\u0000\u033f\u0342\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000"+
		"\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0346\u0001\u0000\u0000"+
		"\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0343\u0345\u0003P(\u0000\u0344"+
		"\u0343\u0001\u0000\u0000\u0000\u0345\u0348\u0001\u0000\u0000\u0000\u0346"+
		"\u0344\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347"+
		"C\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u00059\u0000\u0000\u034a\u034c\u0005*\u0000\u0000\u034b\u034d\u0003\n"+
		"\u0005\u0000\u034c\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000"+
		"\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000"+
		"\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0354\u0005+\u0000"+
		"\u0000\u0351\u0353\u0003\u0092I\u0000\u0352\u0351\u0001\u0000\u0000\u0000"+
		"\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000"+
		"\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u035a\u0001\u0000\u0000\u0000"+
		"\u0356\u0354\u0001\u0000\u0000\u0000\u0357\u0359\u0003\u0084B\u0000\u0358"+
		"\u0357\u0001\u0000\u0000\u0000\u0359\u035c\u0001\u0000\u0000\u0000\u035a"+
		"\u0358\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b"+
		"\u0360\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035d"+
		"\u035f\u0003P(\u0000\u035e\u035d\u0001\u0000\u0000\u0000\u035f\u0362\u0001"+
		"\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0360\u0361\u0001"+
		"\u0000\u0000\u0000\u0361E\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000"+
		"\u0000\u0000\u0363\u0364\u0005:\u0000\u0000\u0364\u0365\u0005;\u0000\u0000"+
		"\u0365\u0366\u0003\u00a2Q\u0000\u0366\u0368\u0005*\u0000\u0000\u0367\u0369"+
		"\u0003\n\u0005\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0369\u036a\u0001"+
		"\u0000\u0000\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036a\u036b\u0001"+
		"\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u0370\u0005"+
		"+\u0000\u0000\u036d\u036f\u0003\u0094J\u0000\u036e\u036d\u0001\u0000\u0000"+
		"\u0000\u036f\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0376\u0001\u0000\u0000"+
		"\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0373\u0375\u0003\u0084B\u0000"+
		"\u0374\u0373\u0001\u0000\u0000\u0000\u0375\u0378\u0001\u0000\u0000\u0000"+
		"\u0376\u0374\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000"+
		"\u0377\u037c\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000\u0000\u0000"+
		"\u0379\u037b\u0003P(\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037b\u037e"+
		"\u0001\u0000\u0000\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037c\u037d"+
		"\u0001\u0000\u0000\u0000\u037dG\u0001\u0000\u0000\u0000\u037e\u037c\u0001"+
		"\u0000\u0000\u0000\u037f\u0380\u0005<\u0000\u0000\u0380\u0381\u0005\u000f"+
		"\u0000\u0000\u0381\u0382\u0005\u00bc\u0000\u0000\u0382\u0383\u0005 \u0000"+
		"\u0000\u0383\u0387\u0003\u009aM\u0000\u0384\u0386\u0003\u0096K\u0000\u0385"+
		"\u0384\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387"+
		"\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388"+
		"\u038d\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a"+
		"\u038c\u0003\u0084B\u0000\u038b\u038a\u0001\u0000\u0000\u0000\u038c\u038f"+
		"\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038d\u038e"+
		"\u0001\u0000\u0000\u0000\u038e\u0393\u0001\u0000\u0000\u0000\u038f\u038d"+
		"\u0001\u0000\u0000\u0000\u0390\u0392\u0003P(\u0000\u0391\u0390\u0001\u0000"+
		"\u0000\u0000\u0392\u0395\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000"+
		"\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394I\u0001\u0000\u0000"+
		"\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0396\u0397\u0005=\u0000\u0000"+
		"\u0397\u0398\u0005\u00ba\u0000\u0000\u0398\u0399\u0005\u000f\u0000\u0000"+
		"\u0399\u039d\u0005\u00bc\u0000\u0000\u039a\u039c\u0003\u0098L\u0000\u039b"+
		"\u039a\u0001\u0000\u0000\u0000\u039c\u039f\u0001\u0000\u0000\u0000\u039d"+
		"\u039b\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e"+
		"\u03a3\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a2\u0003\u0084B\u0000\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a5"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a9\u0001\u0000\u0000\u0000\u03a5\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a8\u0003P(\u0000\u03a7\u03a6\u0001\u0000"+
		"\u0000\u0000\u03a8\u03ab\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000"+
		"\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aaK\u0001\u0000\u0000"+
		"\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005>\u0000\u0000"+
		"\u03ad\u03ae\u0003N\'\u0000\u03ae\u03af\u0005\u000f\u0000\u0000\u03af"+
		"\u03b0\u0005\u00bc\u0000\u0000\u03b0\u03b1\u00053\u0000\u0000\u03b1\u03b2"+
		"\u0005\u00ba\u0000\u0000\u03b2\u03b3\u0005?\u0000\u0000\u03b3\u03b7\u0003"+
		"\u00acV\u0000\u03b4\u03b6\u0003\\.\u0000\u03b5\u03b4\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b9\u0001\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000"+
		"\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03bd\u0001\u0000\u0000"+
		"\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03ba\u03bc\u0003\u0084B\u0000"+
		"\u03bb\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000"+
		"\u03bd\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000"+
		"\u03be\u03c3\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000"+
		"\u03c0\u03c2\u0003P(\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c4M\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c7\u0007\u0000\u0000\u0000\u03c7O\u0001\u0000"+
		"\u0000\u0000\u03c8\u03c9\u0005C\u0000\u0000\u03c9\u03ca\u0005\u00ba\u0000"+
		"\u0000\u03ca\u03cb\u0005D\u0000\u0000\u03cb\u03cc\u0003Z-\u0000\u03cc"+
		"Q\u0001\u0000\u0000\u0000\u03cd\u03ce\u0005E\u0000\u0000\u03ce\u03d1\u0003"+
		"T*\u0000\u03cf\u03d0\u0005F\u0000\u0000\u03d0\u03d2\u0005\u00bd\u0000"+
		"\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d5\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005G\u0000\u0000"+
		"\u03d4\u03d6\u0005\u00bd\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d9\u0001\u0000\u0000\u0000"+
		"\u03d7\u03d8\u0005H\u0000\u0000\u03d8\u03da\u0005\u00bb\u0000\u0000\u03d9"+
		"\u03d7\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da"+
		"S\u0001\u0000\u0000\u0000\u03db\u03dc\u0007\u0001\u0000\u0000\u03dcU\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0005M\u0000\u0000\u03de\u03df\u0003X,"+
		"\u0000\u03dfW\u0001\u0000\u0000\u0000\u03e0\u03e1\u0007\u0002\u0000\u0000"+
		"\u03e1Y\u0001\u0000\u0000\u0000\u03e2\u03e3\u0005S\u0000\u0000\u03e3\u03ea"+
		"\u0005\u00ba\u0000\u0000\u03e4\u03e5\u0005T\u0000\u0000\u03e5\u03ea\u0005"+
		"\u00ba\u0000\u0000\u03e6\u03e7\u0005U\u0000\u0000\u03e7\u03e8\u0005V\u0000"+
		"\u0000\u03e8\u03ea\u0005\u00ba\u0000\u0000\u03e9\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e9\u03e4\u0001\u0000\u0000\u0000\u03e9\u03e6\u0001\u0000\u0000"+
		"\u0000\u03ea[\u0001\u0000\u0000\u0000\u03eb\u03ec\u0005W\u0000\u0000\u03ec"+
		"\u03f5\u0005\u00bb\u0000\u0000\u03ed\u03ee\u0005X\u0000\u0000\u03ee\u03f5"+
		"\u0005\u00bb\u0000\u0000\u03ef\u03f0\u0005Y\u0000\u0000\u03f0\u03f5\u0005"+
		"\u00ba\u0000\u0000\u03f1\u03f2\u0005Z\u0000\u0000\u03f2\u03f5\u0005\u00ba"+
		"\u0000\u0000\u03f3\u03f5\u0003P(\u0000\u03f4\u03eb\u0001\u0000\u0000\u0000"+
		"\u03f4\u03ed\u0001\u0000\u0000\u0000\u03f4\u03ef\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f1\u0001\u0000\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f5]\u0001\u0000\u0000\u0000\u03f6\u03f7\u0005[\u0000\u0000\u03f7\u0402"+
		"\u0005\u00ba\u0000\u0000\u03f8\u03f9\u0005\u0004\u0000\u0000\u03f9\u0402"+
		"\u0005\u00bd\u0000\u0000\u03fa\u03fb\u0005\\\u0000\u0000\u03fb\u0402\u0005"+
		"\u00ba\u0000\u0000\u03fc\u0402\u0005]\u0000\u0000\u03fd\u0402\u0005^\u0000"+
		"\u0000\u03fe\u03ff\u0005_\u0000\u0000\u03ff\u0402\u0005\u00ba\u0000\u0000"+
		"\u0400\u0402\u0003P(\u0000\u0401\u03f6\u0001\u0000\u0000\u0000\u0401\u03f8"+
		"\u0001\u0000\u0000\u0000\u0401\u03fa\u0001\u0000\u0000\u0000\u0401\u03fc"+
		"\u0001\u0000\u0000\u0000\u0401\u03fd\u0001\u0000\u0000\u0000\u0401\u03fe"+
		"\u0001\u0000\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0402_\u0001"+
		"\u0000\u0000\u0000\u0403\u0404\u0005`\u0000\u0000\u0404\u0413\u0005\u00ba"+
		"\u0000\u0000\u0405\u0406\u00056\u0000\u0000\u0406\u0413\u0005\u00bd\u0000"+
		"\u0000\u0407\u0408\u0005a\u0000\u0000\u0408\u0413\u0005\u00ba\u0000\u0000"+
		"\u0409\u040a\u0005b\u0000\u0000\u040a\u0413\u0005\u00bb\u0000\u0000\u040b"+
		"\u040c\u0005c\u0000\u0000\u040c\u0413\u0003Z-\u0000\u040d\u040e\u0005"+
		"_\u0000\u0000\u040e\u0413\u0005\u00ba\u0000\u0000\u040f\u0410\u0005d\u0000"+
		"\u0000\u0410\u0413\u0005\u00bc\u0000\u0000\u0411\u0413\u0003P(\u0000\u0412"+
		"\u0403\u0001\u0000\u0000\u0000\u0412\u0405\u0001\u0000\u0000\u0000\u0412"+
		"\u0407\u0001\u0000\u0000\u0000\u0412\u0409\u0001\u0000\u0000\u0000\u0412"+
		"\u040b\u0001\u0000\u0000\u0000\u0412\u040d\u0001\u0000\u0000\u0000\u0412"+
		"\u040f\u0001\u0000\u0000\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0413"+
		"a\u0001\u0000\u0000\u0000\u0414\u0415\u0005e\u0000\u0000\u0415\u041a\u0005"+
		"\u00ba\u0000\u0000\u0416\u0417\u0005b\u0000\u0000\u0417\u041a\u0005\u00bb"+
		"\u0000\u0000\u0418\u041a\u0003P(\u0000\u0419\u0414\u0001\u0000\u0000\u0000"+
		"\u0419\u0416\u0001\u0000\u0000\u0000\u0419\u0418\u0001\u0000\u0000\u0000"+
		"\u041ac\u0001\u0000\u0000\u0000\u041b\u041c\u0005e\u0000\u0000\u041c\u0423"+
		"\u0005\u00ba\u0000\u0000\u041d\u041e\u0005f\u0000\u0000\u041e\u0423\u0005"+
		"\u00bb\u0000\u0000\u041f\u0420\u0005b\u0000\u0000\u0420\u0423\u0005\u00bb"+
		"\u0000\u0000\u0421\u0423\u0003P(\u0000\u0422\u041b\u0001\u0000\u0000\u0000"+
		"\u0422\u041d\u0001\u0000\u0000\u0000\u0422\u041f\u0001\u0000\u0000\u0000"+
		"\u0422\u0421\u0001\u0000\u0000\u0000\u0423e\u0001\u0000\u0000\u0000\u0424"+
		"\u042b\u0005g\u0000\u0000\u0425\u042b\u0005h\u0000\u0000\u0426\u042b\u0005"+
		"i\u0000\u0000\u0427\u0428\u0005j\u0000\u0000\u0428\u042b\u0003Z-\u0000"+
		"\u0429\u042b\u0003P(\u0000\u042a\u0424\u0001\u0000\u0000\u0000\u042a\u0425"+
		"\u0001\u0000\u0000\u0000\u042a\u0426\u0001\u0000\u0000\u0000\u042a\u0427"+
		"\u0001\u0000\u0000\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042bg\u0001"+
		"\u0000\u0000\u0000\u042c\u042d\u00056\u0000\u0000\u042d\u0434\u0005\u00bd"+
		"\u0000\u0000\u042e\u042f\u0005k\u0000\u0000\u042f\u0434\u0005\u00bb\u0000"+
		"\u0000\u0430\u0431\u0005l\u0000\u0000\u0431\u0434\u0003Z-\u0000\u0432"+
		"\u0434\u0003P(\u0000\u0433\u042c\u0001\u0000\u0000\u0000\u0433\u042e\u0001"+
		"\u0000\u0000\u0000\u0433\u0430\u0001\u0000\u0000\u0000\u0433\u0432\u0001"+
		"\u0000\u0000\u0000\u0434i\u0001\u0000\u0000\u0000\u0435\u0436\u00056\u0000"+
		"\u0000\u0436\u043b\u0005\u00bd\u0000\u0000\u0437\u043b\u0005h\u0000\u0000"+
		"\u0438\u043b\u0005m\u0000\u0000\u0439\u043b\u0003P(\u0000\u043a\u0435"+
		"\u0001\u0000\u0000\u0000\u043a\u0437\u0001\u0000\u0000\u0000\u043a\u0438"+
		"\u0001\u0000\u0000\u0000\u043a\u0439\u0001\u0000\u0000\u0000\u043bk\u0001"+
		"\u0000\u0000\u0000\u043c\u043d\u0005n\u0000\u0000\u043d\u0443\u0005\u00bd"+
		"\u0000\u0000\u043e\u043f\u0005o\u0000\u0000\u043f\u0443\u0005\u00bd\u0000"+
		"\u0000\u0440\u0441\u0005p\u0000\u0000\u0441\u0443\u0005\u00bb\u0000\u0000"+
		"\u0442\u043c\u0001\u0000\u0000\u0000\u0442\u043e\u0001\u0000\u0000\u0000"+
		"\u0442\u0440\u0001\u0000\u0000\u0000\u0443m\u0001\u0000\u0000\u0000\u0444"+
		"\u0445\u0005;\u0000\u0000\u0445\u044e\u0003\u00a2Q\u0000\u0446\u0447\u0005"+
		"q\u0000\u0000\u0447\u044e\u0005\u00be\u0000\u0000\u0448\u0449\u0005r\u0000"+
		"\u0000\u0449\u044e\u0003Z-\u0000\u044a\u044b\u0005d\u0000\u0000\u044b"+
		"\u044e\u0005\u00bc\u0000\u0000\u044c\u044e\u0003P(\u0000\u044d\u0444\u0001"+
		"\u0000\u0000\u0000\u044d\u0446\u0001\u0000\u0000\u0000\u044d\u0448\u0001"+
		"\u0000\u0000\u0000\u044d\u044a\u0001\u0000\u0000\u0000\u044d\u044c\u0001"+
		"\u0000\u0000\u0000\u044eo\u0001\u0000\u0000\u0000\u044f\u0450\u0005i\u0000"+
		"\u0000\u0450\u0451\u0005\u00bb\u0000\u0000\u0451q\u0001\u0000\u0000\u0000"+
		"\u0452\u0453\u0005b\u0000\u0000\u0453\u0458\u0005\u00bb\u0000\u0000\u0454"+
		"\u0455\u0005s\u0000\u0000\u0455\u0458\u0005\u00bb\u0000\u0000\u0456\u0458"+
		"\u0003P(\u0000\u0457\u0452\u0001\u0000\u0000\u0000\u0457\u0454\u0001\u0000"+
		"\u0000\u0000\u0457\u0456\u0001\u0000\u0000\u0000\u0458s\u0001\u0000\u0000"+
		"\u0000\u0459\u045a\u0005t\u0000\u0000\u045a\u045f\u0005\u00bb\u0000\u0000"+
		"\u045b\u045c\u0005u\u0000\u0000\u045c\u045f\u0005\u00bc\u0000\u0000\u045d"+
		"\u045f\u0003P(\u0000\u045e\u0459\u0001\u0000\u0000\u0000\u045e\u045b\u0001"+
		"\u0000\u0000\u0000\u045e\u045d\u0001\u0000\u0000\u0000\u045fu\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0005v\u0000\u0000\u0461\u0464\u0003\u00a4R\u0000"+
		"\u0462\u0464\u0003P(\u0000\u0463\u0460\u0001\u0000\u0000\u0000\u0463\u0462"+
		"\u0001\u0000\u0000\u0000\u0464w\u0001\u0000\u0000\u0000\u0465\u0467\u0003"+
		"z=\u0000\u0466\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000"+
		"\u0000\u0468\u0466\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000"+
		"\u0000\u0469y\u0001\u0000\u0000\u0000\u046a\u046b\u0005w\u0000\u0000\u046b"+
		"\u046c\u0005\u00ba\u0000\u0000\u046c\u046d\u0005#\u0000\u0000\u046d\u046e"+
		"\u0003\u009cN\u0000\u046e{\u0001\u0000\u0000\u0000\u046f\u0470\u0005x"+
		"\u0000\u0000\u0470\u0475\u0005\u00bb\u0000\u0000\u0471\u0472\u0005b\u0000"+
		"\u0000\u0472\u0475\u0005\u00bb\u0000\u0000\u0473\u0475\u0003P(\u0000\u0474"+
		"\u046f\u0001\u0000\u0000\u0000\u0474\u0471\u0001\u0000\u0000\u0000\u0474"+
		"\u0473\u0001\u0000\u0000\u0000\u0475}\u0001\u0000\u0000\u0000\u0476\u0477"+
		"\u0005y\u0000\u0000\u0477\u047a\u0005\u00be\u0000\u0000\u0478\u047a\u0003"+
		"P(\u0000\u0479\u0476\u0001\u0000\u0000\u0000\u0479\u0478\u0001\u0000\u0000"+
		"\u0000\u047a\u007f\u0001\u0000\u0000\u0000\u047b\u047c\u0005\u000b\u0000"+
		"\u0000\u047c\u047d\u0005z\u0000\u0000\u047d\u0481\u0003\u00a0P\u0000\u047e"+
		"\u0480\u0003\u0084B\u0000\u047f\u047e\u0001\u0000\u0000\u0000\u0480\u0483"+
		"\u0001\u0000\u0000\u0000\u0481\u047f\u0001\u0000\u0000\u0000\u0481\u0482"+
		"\u0001\u0000\u0000\u0000\u0482\u0081\u0001\u0000\u0000\u0000\u0483\u0481"+
		"\u0001\u0000\u0000\u0000\u0484\u0485\u0005{\u0000\u0000\u0485\u0486\u0005"+
		"\u000f\u0000\u0000\u0486\u048a\u0005\u00bc\u0000\u0000\u0487\u0489\u0003"+
		"\u0086C\u0000\u0488\u0487\u0001\u0000\u0000\u0000\u0489\u048c\u0001\u0000"+
		"\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u048b\u0001\u0000"+
		"\u0000\u0000\u048b\u0083\u0001\u0000\u0000\u0000\u048c\u048a\u0001\u0000"+
		"\u0000\u0000\u048d\u048e\u0005|\u0000\u0000\u048e\u04a5\u0005\u00bd\u0000"+
		"\u0000\u048f\u0490\u0005}\u0000\u0000\u0490\u04a5\u0005\u00bd\u0000\u0000"+
		"\u0491\u0492\u0005~\u0000\u0000\u0492\u04a5\u0005\u00bd\u0000\u0000\u0493"+
		"\u0494\u0005\u007f\u0000\u0000\u0494\u04a5\u0005\u00bd\u0000\u0000\u0495"+
		"\u0496\u0005\u0080\u0000\u0000\u0496\u04a5\u0003\u009eO\u0000\u0497\u0498"+
		"\u0005\u0081\u0000\u0000\u0498\u04a5\u0005\u00bd\u0000\u0000\u0499\u049a"+
		"\u0005\u0082\u0000\u0000\u049a\u04a5\u0005\u00bd\u0000\u0000\u049b\u049c"+
		"\u0005\u0083\u0000\u0000\u049c\u04a5\u0005\u00bd\u0000\u0000\u049d\u049e"+
		"\u0005\u0084\u0000\u0000\u049e\u04a5\u0005\u00bb\u0000\u0000\u049f\u04a0"+
		"\u0005\u0085\u0000\u0000\u04a0\u04a5\u0005\u00bb\u0000\u0000\u04a1\u04a2"+
		"\u0005\u0086\u0000\u0000\u04a2\u04a5\u0005\u00ba\u0000\u0000\u04a3\u04a5"+
		"\u0003P(\u0000\u04a4\u048d\u0001\u0000\u0000\u0000\u04a4\u048f\u0001\u0000"+
		"\u0000\u0000\u04a4\u0491\u0001\u0000\u0000\u0000\u04a4\u0493\u0001\u0000"+
		"\u0000\u0000\u04a4\u0495\u0001\u0000\u0000\u0000\u04a4\u0497\u0001\u0000"+
		"\u0000\u0000\u04a4\u0499\u0001\u0000\u0000\u0000\u04a4\u049b\u0001\u0000"+
		"\u0000\u0000\u04a4\u049d\u0001\u0000\u0000\u0000\u04a4\u049f\u0001\u0000"+
		"\u0000\u0000\u04a4\u04a1\u0001\u0000\u0000\u0000\u04a4\u04a3\u0001\u0000"+
		"\u0000\u0000\u04a5\u0085\u0001\u0000\u0000\u0000\u04a6\u04a7\u0005\u0087"+
		"\u0000\u0000\u04a7\u04b3\u0005\u00ba\u0000\u0000\u04a8\u04a9\u0005\u0088"+
		"\u0000\u0000\u04a9\u04b3\u0005\u00ba\u0000\u0000\u04aa\u04ab\u0005\u0089"+
		"\u0000\u0000\u04ab\u04b3\u0005\u00bd\u0000\u0000\u04ac\u04ad\u0005\u008a"+
		"\u0000\u0000\u04ad\u04b3\u0005\u00be\u0000\u0000\u04ae\u04af\u0005\u008b"+
		"\u0000\u0000\u04af\u04b3\u0005\u00bb\u0000\u0000\u04b0\u04b1\u0005\u008c"+
		"\u0000\u0000\u04b1\u04b3\u0005\u00ba\u0000\u0000\u04b2\u04a6\u0001\u0000"+
		"\u0000\u0000\u04b2\u04a8\u0001\u0000\u0000\u0000\u04b2\u04aa\u0001\u0000"+
		"\u0000\u0000\u04b2\u04ac\u0001\u0000\u0000\u0000\u04b2\u04ae\u0001\u0000"+
		"\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000\u04b3\u0087\u0001\u0000"+
		"\u0000\u0000\u04b4\u04b5\u0005\u008d\u0000\u0000\u04b5\u04b8\u0005\u00bb"+
		"\u0000\u0000\u04b6\u04b8\u0003P(\u0000\u04b7\u04b4\u0001\u0000\u0000\u0000"+
		"\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b8\u0089\u0001\u0000\u0000\u0000"+
		"\u04b9\u04ba\u0005b\u0000\u0000\u04ba\u04bf\u0005\u00bb\u0000\u0000\u04bb"+
		"\u04bc\u0005\u008e\u0000\u0000\u04bc\u04bf\u0005\u00bd\u0000\u0000\u04bd"+
		"\u04bf\u0003P(\u0000\u04be\u04b9\u0001\u0000\u0000\u0000\u04be\u04bb\u0001"+
		"\u0000\u0000\u0000\u04be\u04bd\u0001\u0000\u0000\u0000\u04bf\u008b\u0001"+
		"\u0000\u0000\u0000\u04c0\u04c1\u0005\u008f\u0000\u0000\u04c1\u04c4\u0005"+
		"\u00ba\u0000\u0000\u04c2\u04c4\u0003P(\u0000\u04c3\u04c0\u0001\u0000\u0000"+
		"\u0000\u04c3\u04c2\u0001\u0000\u0000\u0000\u04c4\u008d\u0001\u0000\u0000"+
		"\u0000\u04c5\u04c6\u0005\u0090\u0000\u0000\u04c6\u04cb\u0005\u00ba\u0000"+
		"\u0000\u04c7\u04c8\u0005\u0091\u0000\u0000\u04c8\u04cb\u0003\u009cN\u0000"+
		"\u04c9\u04cb\u0003P(\u0000\u04ca\u04c5\u0001\u0000\u0000\u0000\u04ca\u04c7"+
		"\u0001\u0000\u0000\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000\u04cb\u008f"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0005n\u0000\u0000\u04cd\u04d4\u0005"+
		"\u00bd\u0000\u0000\u04ce\u04cf\u0005o\u0000\u0000\u04cf\u04d4\u0005\u00bd"+
		"\u0000\u0000\u04d0\u04d1\u0005p\u0000\u0000\u04d1\u04d4\u0005\u00bb\u0000"+
		"\u0000\u04d2\u04d4\u0003P(\u0000\u04d3\u04cc\u0001\u0000\u0000\u0000\u04d3"+
		"\u04ce\u0001\u0000\u0000\u0000\u04d3\u04d0\u0001\u0000\u0000\u0000\u04d3"+
		"\u04d2\u0001\u0000\u0000\u0000\u04d4\u0091\u0001\u0000\u0000\u0000\u04d5"+
		"\u04d6\u0005\u0092\u0000\u0000\u04d6\u04dd\u0005\u00bb\u0000\u0000\u04d7"+
		"\u04d8\u0005\u0093\u0000\u0000\u04d8\u04dd\u0005\u00bb\u0000\u0000\u04d9"+
		"\u04da\u0005\u0094\u0000\u0000\u04da\u04dd\u0005\u00bb\u0000\u0000\u04db"+
		"\u04dd\u0003P(\u0000\u04dc\u04d5\u0001\u0000\u0000\u0000\u04dc\u04d7\u0001"+
		"\u0000\u0000\u0000\u04dc\u04d9\u0001\u0000\u0000\u0000\u04dc\u04db\u0001"+
		"\u0000\u0000\u0000\u04dd\u0093\u0001\u0000\u0000\u0000\u04de\u04df\u0005"+
		"\u0095\u0000\u0000\u04df\u04e4\u0005\u00be\u0000\u0000\u04e0\u04e1\u0005"+
		"\u0096\u0000\u0000\u04e1\u04e3\u0005\u00be\u0000\u0000\u04e2\u04e0\u0001"+
		"\u0000\u0000\u0000\u04e3\u04e6\u0001\u0000\u0000\u0000\u04e4\u04e2\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5\u04e9\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e4\u0001\u0000\u0000\u0000\u04e7\u04e9\u0003"+
		"P(\u0000\u04e8\u04de\u0001\u0000\u0000\u0000\u04e8\u04e7\u0001\u0000\u0000"+
		"\u0000\u04e9\u0095\u0001\u0000\u0000\u0000\u04ea\u04eb\u0005b\u0000\u0000"+
		"\u04eb\u04f0\u0005\u00bb\u0000\u0000\u04ec\u04ed\u0005\u008d\u0000\u0000"+
		"\u04ed\u04f0\u0005\u00bb\u0000\u0000\u04ee\u04f0\u0003P(\u0000\u04ef\u04ea"+
		"\u0001\u0000\u0000\u0000\u04ef\u04ec\u0001\u0000\u0000\u0000\u04ef\u04ee"+
		"\u0001\u0000\u0000\u0000\u04f0\u0097\u0001\u0000\u0000\u0000\u04f1\u04f2"+
		"\u0005\u0097\u0000\u0000\u04f2\u0501\u0005\u00ba\u0000\u0000\u04f3\u04f4"+
		"\u0005\u0098\u0000\u0000\u04f4\u0501\u0005\u00ba\u0000\u0000\u04f5\u04f6"+
		"\u0005\u0099\u0000\u0000\u04f6\u0501\u0005\u00ba\u0000\u0000\u04f7\u04f8"+
		"\u0005z\u0000\u0000\u04f8\u0501\u0003\u00aaU\u0000\u04f9\u04fa\u0005\u009a"+
		"\u0000\u0000\u04fa\u0501\u0005\u00bb\u0000\u0000\u04fb\u04fc\u0005\u0006"+
		"\u0000\u0000\u04fc\u0501\u0005\u00bb\u0000\u0000\u04fd\u04fe\u0005\u009b"+
		"\u0000\u0000\u04fe\u0501\u0003\u009cN\u0000\u04ff\u0501\u0003P(\u0000"+
		"\u0500\u04f1\u0001\u0000\u0000\u0000\u0500\u04f3\u0001\u0000\u0000\u0000"+
		"\u0500\u04f5\u0001\u0000\u0000\u0000\u0500\u04f7\u0001\u0000\u0000\u0000"+
		"\u0500\u04f9\u0001\u0000\u0000\u0000\u0500\u04fb\u0001\u0000\u0000\u0000"+
		"\u0500\u04fd\u0001\u0000\u0000\u0000\u0500\u04ff\u0001\u0000\u0000\u0000"+
		"\u0501\u0099\u0001\u0000\u0000\u0000\u0502\u0507\u0005\u00ba\u0000\u0000"+
		"\u0503\u0504\u0005\u0096\u0000\u0000\u0504\u0506\u0005\u00ba\u0000\u0000"+
		"\u0505\u0503\u0001\u0000\u0000\u0000\u0506\u0509\u0001\u0000\u0000\u0000"+
		"\u0507\u0505\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000"+
		"\u0508\u009b\u0001\u0000\u0000\u0000\u0509\u0507\u0001\u0000\u0000\u0000"+
		"\u050a\u050f\u0005\u00ba\u0000\u0000\u050b\u050c\u0005\u0096\u0000\u0000"+
		"\u050c\u050e\u0005\u00ba\u0000\u0000\u050d\u050b\u0001\u0000\u0000\u0000"+
		"\u050e\u0511\u0001\u0000\u0000\u0000\u050f\u050d\u0001\u0000\u0000\u0000"+
		"\u050f\u0510\u0001\u0000\u0000\u0000\u0510\u009d\u0001\u0000\u0000\u0000"+
		"\u0511\u050f\u0001\u0000\u0000\u0000\u0512\u0513\u0007\u0003\u0000\u0000"+
		"\u0513\u009f\u0001\u0000\u0000\u0000\u0514\u0515\u0007\u0004\u0000\u0000"+
		"\u0515\u00a1\u0001\u0000\u0000\u0000\u0516\u0517\u0007\u0005\u0000\u0000"+
		"\u0517\u00a3\u0001\u0000\u0000\u0000\u0518\u0519\u0007\u0006\u0000\u0000"+
		"\u0519\u00a5\u0001\u0000\u0000\u0000\u051a\u051b\u0007\u0007\u0000\u0000"+
		"\u051b\u00a7\u0001\u0000\u0000\u0000\u051c\u051d\u0007\b\u0000\u0000\u051d"+
		"\u00a9\u0001\u0000\u0000\u0000\u051e\u051f\u0007\t\u0000\u0000\u051f\u00ab"+
		"\u0001\u0000\u0000\u0000\u0520\u0521\u0005*\u0000\u0000\u0521\u0526\u0003"+
		"\u00aeW\u0000\u0522\u0523\u0005\u0096\u0000\u0000\u0523\u0525\u0003\u00ae"+
		"W\u0000\u0524\u0522\u0001\u0000\u0000\u0000\u0525\u0528\u0001\u0000\u0000"+
		"\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0526\u0527\u0001\u0000\u0000"+
		"\u0000\u0527\u0529\u0001\u0000\u0000\u0000\u0528\u0526\u0001\u0000\u0000"+
		"\u0000\u0529\u052a\u0005+\u0000\u0000\u052a\u00ad\u0001\u0000\u0000\u0000"+
		"\u052b\u052c\u0005\u00ba\u0000\u0000\u052c\u052d\u0005\u00b9\u0000\u0000"+
		"\u052d\u052e\u0007\n\u0000\u0000\u052e\u00af\u0001\u0000\u0000\u0000\u008d"+
		"\u00b3\u00bd\u00cb\u00d2\u00d6\u00da\u00de\u0103\u010a\u0110\u0116\u011c"+
		"\u0125\u012b\u0131\u013a\u0140\u0146\u014f\u0155\u015b\u0165\u016b\u0171"+
		"\u017c\u0182\u0188\u018f\u0194\u019a\u01a0\u01a6\u01ac\u01b2\u01bb\u01c1"+
		"\u01c7\u01d6\u01dc\u01e2\u01ed\u01f3\u01fe\u0204\u020e\u0214\u021a\u0225"+
		"\u022b\u0231\u0239\u0242\u024b\u0251\u0257\u0260\u0266\u026c\u0274\u027a"+
		"\u0280\u0289\u0292\u0298\u029e\u02a7\u02ad\u02b3\u02bc\u02c2\u02c8\u02d5"+
		"\u02db\u02e1\u02ea\u02f0\u02f6\u0301\u0307\u030d\u0318\u031e\u032b\u0331"+
		"\u033a\u0340\u0346\u034e\u0354\u035a\u0360\u036a\u0370\u0376\u037c\u0387"+
		"\u038d\u0393\u039d\u03a3\u03a9\u03b7\u03bd\u03c3\u03d1\u03d5\u03d9\u03e9"+
		"\u03f4\u0401\u0412\u0419\u0422\u042a\u0433\u043a\u0442\u044d\u0457\u045e"+
		"\u0463\u0468\u0474\u0479\u0481\u048a\u04a4\u04b2\u04b7\u04be\u04c3\u04ca"+
		"\u04d3\u04dc\u04e4\u04e8\u04ef\u0500\u0507\u050f\u0526";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}