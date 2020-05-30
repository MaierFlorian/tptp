package parser;
// Generated from tptp_v7_0_0_0.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tptp_v7_0_0_0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, Or=44, And=45, Iff=46, 
		Impl=47, If=48, Niff=49, Nor=50, Nand=51, Not=52, ForallComb=53, TyForall=54, 
		Infix_inequality=55, Infix_equality=56, Forall=57, ExistsComb=58, TyExists=59, 
		Exists=60, Lambda=61, ChoiceComb=62, Choice=63, DescriptionComb=64, Description=65, 
		EqComb=66, App=67, Assignment=68, Arrow=69, Star=70, Plus=71, Subtype_sign=72, 
		Gentzen_arrow=73, Real=74, Signed_real=75, Unsigned_real=76, Rational=77, 
		Signed_rational=78, Unsigned_rational=79, Integer=80, Signed_integer=81, 
		Unsigned_integer=82, Decimal=83, Positive_decimal=84, Decimal_exponent=85, 
		Decimal_fraction=86, Dot_decimal=87, Exp_integer=88, Signed_exp_integer=89, 
		Unsigned_exp_integer=90, Dollar_word=91, Dollar_dollar_word=92, Upper_word=93, 
		Lower_word=94, Single_quoted=95, Distinct_object=96, WS=97, Line_comment=98, 
		Block_comment=99;
	public static final int
		RULE_tptp_file = 0, RULE_tptp_input = 1, RULE_annotated_formula = 2, RULE_tpi_annotated = 3, 
		RULE_tpi_formula = 4, RULE_thf_annotated = 5, RULE_tfx_annotated = 6, 
		RULE_tff_annotated = 7, RULE_tcf_annotated = 8, RULE_fof_annotated = 9, 
		RULE_cnf_annotated = 10, RULE_annotations = 11, RULE_formula_role = 12, 
		RULE_thf_formula = 13, RULE_thf_logic_formula = 14, RULE_thf_binary_formula = 15, 
		RULE_thf_binary_pair = 16, RULE_thf_binary_tuple = 17, RULE_thf_or_formula = 18, 
		RULE_thf_and_formula = 19, RULE_thf_apply_formula = 20, RULE_thf_unitary_formula = 21, 
		RULE_thf_quantified_formula = 22, RULE_thf_quantification = 23, RULE_thf_variable = 24, 
		RULE_thf_typed_variable = 25, RULE_thf_unary_formula = 26, RULE_thf_atom = 27, 
		RULE_thf_function = 28, RULE_thf_conn_term = 29, RULE_thf_conditional = 30, 
		RULE_thf_let = 31, RULE_thf_arguments = 32, RULE_thf_type_formula = 33, 
		RULE_thf_typeable_formula = 34, RULE_thf_subtype = 35, RULE_thf_top_level_type = 36, 
		RULE_thf_unitary_type = 37, RULE_thf_apply_type = 38, RULE_thf_binary_type = 39, 
		RULE_thf_mapping_type = 40, RULE_thf_xprod_type = 41, RULE_thf_union_type = 42, 
		RULE_thf_sequent = 43, RULE_thf_tuple = 44, RULE_thf_formula_list = 45, 
		RULE_tfx_formula = 46, RULE_tfx_logic_formula = 47, RULE_tff_formula = 48, 
		RULE_tff_logic_formula = 49, RULE_tff_binary_formula = 50, RULE_tff_binary_nonassoc = 51, 
		RULE_tff_binary_assoc = 52, RULE_tff_or_formula = 53, RULE_tff_and_formula = 54, 
		RULE_tff_unitary_formula = 55, RULE_tff_quantified_formula = 56, RULE_tff_variable_list = 57, 
		RULE_tff_variable = 58, RULE_tff_typed_variable = 59, RULE_tff_unary_formula = 60, 
		RULE_tff_atomic_formula = 61, RULE_tff_conditional = 62, RULE_tff_let = 63, 
		RULE_tff_let_term_defns = 64, RULE_tff_let_term_list = 65, RULE_tff_let_term_defn = 66, 
		RULE_tff_let_term_binding = 67, RULE_tff_let_formula_defns = 68, RULE_tff_let_formula_list = 69, 
		RULE_tff_let_formula_defn = 70, RULE_tff_let_formula_binding = 71, RULE_tff_sequent = 72, 
		RULE_tff_formula_tuple = 73, RULE_tff_formula_tuple_list = 74, RULE_tff_typed_atom = 75, 
		RULE_tff_subtype = 76, RULE_tff_top_level_type = 77, RULE_tf1_quantified_type = 78, 
		RULE_tff_monotype = 79, RULE_tff_unitary_type = 80, RULE_tff_atomic_type = 81, 
		RULE_tff_type_arguments = 82, RULE_tff_mapping_type = 83, RULE_tff_xprod_type = 84, 
		RULE_tcf_formula = 85, RULE_tcf_logic_formula = 86, RULE_tcf_quantified_formula = 87, 
		RULE_fof_formula = 88, RULE_fof_logic_formula = 89, RULE_fof_binary_formula = 90, 
		RULE_fof_binary_nonassoc = 91, RULE_fof_binary_assoc = 92, RULE_fof_or_formula = 93, 
		RULE_fof_and_formula = 94, RULE_fof_unitary_formula = 95, RULE_fof_quantified_formula = 96, 
		RULE_fof_variable_list = 97, RULE_fof_unary_formula = 98, RULE_fof_infix_unary = 99, 
		RULE_fof_atomic_formula = 100, RULE_fof_plain_atomic_formula = 101, RULE_fof_defined_atomic_formula = 102, 
		RULE_fof_defined_plain_formula = 103, RULE_fof_defined_infix_formula = 104, 
		RULE_fof_system_atomic_formula = 105, RULE_fof_plain_term = 106, RULE_fof_defined_term = 107, 
		RULE_fof_defined_atomic_term = 108, RULE_fof_defined_plain_term = 109, 
		RULE_fof_system_term = 110, RULE_fof_arguments = 111, RULE_fof_term = 112, 
		RULE_fof_function_term = 113, RULE_tff_conditional_term = 114, RULE_tff_let_term = 115, 
		RULE_tff_tuple_term = 116, RULE_fof_sequent = 117, RULE_fof_formula_tuple = 118, 
		RULE_fof_formula_tuple_list = 119, RULE_cnf_formula = 120, RULE_cnf_disjunction = 121, 
		RULE_cnf_literal = 122, RULE_thf_quantifier = 123, RULE_th0_quantifier = 124, 
		RULE_th1_quantifier = 125, RULE_thf_pair_connective = 126, RULE_thf_unary_connective = 127, 
		RULE_th1_unary_connective = 128, RULE_tff_pair_connective = 129, RULE_fof_quantifier = 130, 
		RULE_binary_connective = 131, RULE_assoc_connective = 132, RULE_unary_connective = 133, 
		RULE_type_constant = 134, RULE_type_functor = 135, RULE_defined_type = 136, 
		RULE_system_type = 137, RULE_atom = 138, RULE_untyped_atom = 139, RULE_defined_proposition = 140, 
		RULE_defined_predicate = 141, RULE_defined_infix_pred = 142, RULE_constant = 143, 
		RULE_functor = 144, RULE_system_constant = 145, RULE_system_functor = 146, 
		RULE_defined_constant = 147, RULE_defined_functor = 148, RULE_defined_term = 149, 
		RULE_variable = 150, RULE_source = 151, RULE_sources = 152, RULE_dag_source = 153, 
		RULE_inference_record = 154, RULE_inference_rule = 155, RULE_inference_parents = 156, 
		RULE_parent_list = 157, RULE_parent_info = 158, RULE_parent_details = 159, 
		RULE_internal_source = 160, RULE_intro_type = 161, RULE_external_source = 162, 
		RULE_file_source = 163, RULE_file_info = 164, RULE_theory = 165, RULE_theory_name = 166, 
		RULE_creator_source = 167, RULE_creator_name = 168, RULE_optional_info = 169, 
		RULE_useful_info = 170, RULE_info_items = 171, RULE_info_item = 172, RULE_formula_item = 173, 
		RULE_description_item = 174, RULE_iquote_item = 175, RULE_inference_item = 176, 
		RULE_inference_status = 177, RULE_status_value = 178, RULE_inference_info = 179, 
		RULE_assumptions_record = 180, RULE_refutation = 181, RULE_new_symbol_record = 182, 
		RULE_new_symbol_list = 183, RULE_principal_symbol = 184, RULE_include = 185, 
		RULE_formula_selection = 186, RULE_name_list = 187, RULE_general_term = 188, 
		RULE_general_data = 189, RULE_general_function = 190, RULE_formula_data = 191, 
		RULE_general_list = 192, RULE_general_terms = 193, RULE_name = 194, RULE_atomic_word = 195, 
		RULE_atomic_defined_word = 196, RULE_atomic_system_word = 197, RULE_number = 198, 
		RULE_file_name = 199;
	private static String[] makeRuleNames() {
		return new String[] {
			"tptp_file", "tptp_input", "annotated_formula", "tpi_annotated", "tpi_formula", 
			"thf_annotated", "tfx_annotated", "tff_annotated", "tcf_annotated", "fof_annotated", 
			"cnf_annotated", "annotations", "formula_role", "thf_formula", "thf_logic_formula", 
			"thf_binary_formula", "thf_binary_pair", "thf_binary_tuple", "thf_or_formula", 
			"thf_and_formula", "thf_apply_formula", "thf_unitary_formula", "thf_quantified_formula", 
			"thf_quantification", "thf_variable", "thf_typed_variable", "thf_unary_formula", 
			"thf_atom", "thf_function", "thf_conn_term", "thf_conditional", "thf_let", 
			"thf_arguments", "thf_type_formula", "thf_typeable_formula", "thf_subtype", 
			"thf_top_level_type", "thf_unitary_type", "thf_apply_type", "thf_binary_type", 
			"thf_mapping_type", "thf_xprod_type", "thf_union_type", "thf_sequent", 
			"thf_tuple", "thf_formula_list", "tfx_formula", "tfx_logic_formula", 
			"tff_formula", "tff_logic_formula", "tff_binary_formula", "tff_binary_nonassoc", 
			"tff_binary_assoc", "tff_or_formula", "tff_and_formula", "tff_unitary_formula", 
			"tff_quantified_formula", "tff_variable_list", "tff_variable", "tff_typed_variable", 
			"tff_unary_formula", "tff_atomic_formula", "tff_conditional", "tff_let", 
			"tff_let_term_defns", "tff_let_term_list", "tff_let_term_defn", "tff_let_term_binding", 
			"tff_let_formula_defns", "tff_let_formula_list", "tff_let_formula_defn", 
			"tff_let_formula_binding", "tff_sequent", "tff_formula_tuple", "tff_formula_tuple_list", 
			"tff_typed_atom", "tff_subtype", "tff_top_level_type", "tf1_quantified_type", 
			"tff_monotype", "tff_unitary_type", "tff_atomic_type", "tff_type_arguments", 
			"tff_mapping_type", "tff_xprod_type", "tcf_formula", "tcf_logic_formula", 
			"tcf_quantified_formula", "fof_formula", "fof_logic_formula", "fof_binary_formula", 
			"fof_binary_nonassoc", "fof_binary_assoc", "fof_or_formula", "fof_and_formula", 
			"fof_unitary_formula", "fof_quantified_formula", "fof_variable_list", 
			"fof_unary_formula", "fof_infix_unary", "fof_atomic_formula", "fof_plain_atomic_formula", 
			"fof_defined_atomic_formula", "fof_defined_plain_formula", "fof_defined_infix_formula", 
			"fof_system_atomic_formula", "fof_plain_term", "fof_defined_term", "fof_defined_atomic_term", 
			"fof_defined_plain_term", "fof_system_term", "fof_arguments", "fof_term", 
			"fof_function_term", "tff_conditional_term", "tff_let_term", "tff_tuple_term", 
			"fof_sequent", "fof_formula_tuple", "fof_formula_tuple_list", "cnf_formula", 
			"cnf_disjunction", "cnf_literal", "thf_quantifier", "th0_quantifier", 
			"th1_quantifier", "thf_pair_connective", "thf_unary_connective", "th1_unary_connective", 
			"tff_pair_connective", "fof_quantifier", "binary_connective", "assoc_connective", 
			"unary_connective", "type_constant", "type_functor", "defined_type", 
			"system_type", "atom", "untyped_atom", "defined_proposition", "defined_predicate", 
			"defined_infix_pred", "constant", "functor", "system_constant", "system_functor", 
			"defined_constant", "defined_functor", "defined_term", "variable", "source", 
			"sources", "dag_source", "inference_record", "inference_rule", "inference_parents", 
			"parent_list", "parent_info", "parent_details", "internal_source", "intro_type", 
			"external_source", "file_source", "file_info", "theory", "theory_name", 
			"creator_source", "creator_name", "optional_info", "useful_info", "info_items", 
			"info_item", "formula_item", "description_item", "iquote_item", "inference_item", 
			"inference_status", "status_value", "inference_info", "assumptions_record", 
			"refutation", "new_symbol_record", "new_symbol_list", "principal_symbol", 
			"include", "formula_selection", "name_list", "general_term", "general_data", 
			"general_function", "formula_data", "general_list", "general_terms", 
			"name", "atomic_word", "atomic_defined_word", "atomic_system_word", "number", 
			"file_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tpi('", "','", "').'", "'thf('", "'tfx('", "'tff('", "'tcf('", 
			"'fof('", "'cnf('", "'('", "')'", "'['", "']'", "':'", "'$ite('", "'$let('", 
			"'[]'", "'{}'", "'{'", "'}'", "'$ite_f('", "'$let_tf('", "'$let_ff('", 
			"'$ite_t('", "'$let_ft('", "'$let_tt('", "'inference('", "'introduced('", 
			"'file('", "'theory('", "'creator('", "'description('", "'iquote('", 
			"'status('", "'assumptions('", "'refutation('", "'new_symbols('", "'include('", 
			"'$thf('", "'$tff('", "'$fof('", "'$cnf('", "'$fot('", "'|'", "'&'", 
			"'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'~'", "'!!'", "'!>'", 
			"'!='", "'='", "'!'", "'??'", "'?*'", "'?'", "'^'", "'@@+'", "'@+'", 
			"'@@-'", "'@-'", "'@='", "'@'", "':='", "'>'", "'*'", "'+'", "'<<'", 
			"'-->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Or", "And", "Iff", "Impl", 
			"If", "Niff", "Nor", "Nand", "Not", "ForallComb", "TyForall", "Infix_inequality", 
			"Infix_equality", "Forall", "ExistsComb", "TyExists", "Exists", "Lambda", 
			"ChoiceComb", "Choice", "DescriptionComb", "Description", "EqComb", "App", 
			"Assignment", "Arrow", "Star", "Plus", "Subtype_sign", "Gentzen_arrow", 
			"Real", "Signed_real", "Unsigned_real", "Rational", "Signed_rational", 
			"Unsigned_rational", "Integer", "Signed_integer", "Unsigned_integer", 
			"Decimal", "Positive_decimal", "Decimal_exponent", "Decimal_fraction", 
			"Dot_decimal", "Exp_integer", "Signed_exp_integer", "Unsigned_exp_integer", 
			"Dollar_word", "Dollar_dollar_word", "Upper_word", "Lower_word", "Single_quoted", 
			"Distinct_object", "WS", "Line_comment", "Block_comment"
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
	public String getGrammarFileName() { return "tptp_v7_0_0_0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tptp_v7_0_0_0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Tptp_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tptp_v7_0_0_0Parser.EOF, 0); }
		public List<Tptp_inputContext> tptp_input() {
			return getRuleContexts(Tptp_inputContext.class);
		}
		public Tptp_inputContext tptp_input(int i) {
			return getRuleContext(Tptp_inputContext.class,i);
		}
		public Tptp_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tptp_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTptp_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTptp_file(this);
		}
	}

	public final Tptp_fileContext tptp_file() throws RecognitionException {
		Tptp_fileContext _localctx = new Tptp_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tptp_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__37))) != 0)) {
				{
				{
				setState(400);
				tptp_input();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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

	public static class Tptp_inputContext extends ParserRuleContext {
		public Annotated_formulaContext annotated_formula() {
			return getRuleContext(Annotated_formulaContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public Tptp_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tptp_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTptp_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTptp_input(this);
		}
	}

	public final Tptp_inputContext tptp_input() throws RecognitionException {
		Tptp_inputContext _localctx = new Tptp_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tptp_input);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				annotated_formula();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				include();
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

	public static class Annotated_formulaContext extends ParserRuleContext {
		public Thf_annotatedContext thf_annotated() {
			return getRuleContext(Thf_annotatedContext.class,0);
		}
		public Tfx_annotatedContext tfx_annotated() {
			return getRuleContext(Tfx_annotatedContext.class,0);
		}
		public Tff_annotatedContext tff_annotated() {
			return getRuleContext(Tff_annotatedContext.class,0);
		}
		public Tcf_annotatedContext tcf_annotated() {
			return getRuleContext(Tcf_annotatedContext.class,0);
		}
		public Fof_annotatedContext fof_annotated() {
			return getRuleContext(Fof_annotatedContext.class,0);
		}
		public Cnf_annotatedContext cnf_annotated() {
			return getRuleContext(Cnf_annotatedContext.class,0);
		}
		public Tpi_annotatedContext tpi_annotated() {
			return getRuleContext(Tpi_annotatedContext.class,0);
		}
		public Annotated_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotated_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAnnotated_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAnnotated_formula(this);
		}
	}

	public final Annotated_formulaContext annotated_formula() throws RecognitionException {
		Annotated_formulaContext _localctx = new Annotated_formulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotated_formula);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				thf_annotated();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				tfx_annotated();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				tff_annotated();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				tcf_annotated();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				fof_annotated();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				cnf_annotated();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				tpi_annotated();
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

	public static class Tpi_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tpi_formulaContext tpi_formula() {
			return getRuleContext(Tpi_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Tpi_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tpi_annotated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTpi_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTpi_annotated(this);
		}
	}

	public final Tpi_annotatedContext tpi_annotated() throws RecognitionException {
		Tpi_annotatedContext _localctx = new Tpi_annotatedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tpi_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__0);
			setState(422);
			name();
			setState(423);
			match(T__1);
			setState(424);
			formula_role();
			setState(425);
			match(T__1);
			setState(426);
			tpi_formula();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(427);
				annotations();
				}
			}

			setState(430);
			match(T__2);
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

	public static class Tpi_formulaContext extends ParserRuleContext {
		public Fof_formulaContext fof_formula() {
			return getRuleContext(Fof_formulaContext.class,0);
		}
		public Tpi_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tpi_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTpi_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTpi_formula(this);
		}
	}

	public final Tpi_formulaContext tpi_formula() throws RecognitionException {
		Tpi_formulaContext _localctx = new Tpi_formulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tpi_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			fof_formula();
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

	public static class Thf_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Thf_formulaContext thf_formula() {
			return getRuleContext(Thf_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Thf_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_annotated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_annotated(this);
		}
	}

	public final Thf_annotatedContext thf_annotated() throws RecognitionException {
		Thf_annotatedContext _localctx = new Thf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thf_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__3);
			setState(435);
			name();
			setState(436);
			match(T__1);
			setState(437);
			formula_role();
			setState(438);
			match(T__1);
			setState(439);
			thf_formula();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(440);
				annotations();
				}
			}

			setState(443);
			match(T__2);
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

	public static class Tfx_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tfx_formulaContext tfx_formula() {
			return getRuleContext(Tfx_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Tfx_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfx_annotated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTfx_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTfx_annotated(this);
		}
	}

	public final Tfx_annotatedContext tfx_annotated() throws RecognitionException {
		Tfx_annotatedContext _localctx = new Tfx_annotatedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tfx_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__4);
			setState(446);
			name();
			setState(447);
			match(T__1);
			setState(448);
			formula_role();
			setState(449);
			match(T__1);
			setState(450);
			tfx_formula();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(451);
				annotations();
				}
			}

			setState(454);
			match(T__2);
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

	public static class Tff_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tff_formulaContext tff_formula() {
			return getRuleContext(Tff_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Tff_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_annotated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_annotated(this);
		}
	}

	public final Tff_annotatedContext tff_annotated() throws RecognitionException {
		Tff_annotatedContext _localctx = new Tff_annotatedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tff_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__5);
			setState(457);
			name();
			setState(458);
			match(T__1);
			setState(459);
			formula_role();
			setState(460);
			match(T__1);
			setState(461);
			tff_formula();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(462);
				annotations();
				}
			}

			setState(465);
			match(T__2);
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

	public static class Tcf_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tcf_formulaContext tcf_formula() {
			return getRuleContext(Tcf_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Tcf_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_annotated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTcf_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTcf_annotated(this);
		}
	}

	public final Tcf_annotatedContext tcf_annotated() throws RecognitionException {
		Tcf_annotatedContext _localctx = new Tcf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tcf_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__6);
			setState(468);
			name();
			setState(469);
			match(T__1);
			setState(470);
			formula_role();
			setState(471);
			match(T__1);
			setState(472);
			tcf_formula();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(473);
				annotations();
				}
			}

			setState(476);
			match(T__2);
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

	public static class Fof_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Fof_formulaContext fof_formula() {
			return getRuleContext(Fof_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Fof_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_annotated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_annotated(this);
		}
	}

	public final Fof_annotatedContext fof_annotated() throws RecognitionException {
		Fof_annotatedContext _localctx = new Fof_annotatedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fof_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__7);
			setState(479);
			name();
			setState(480);
			match(T__1);
			setState(481);
			formula_role();
			setState(482);
			match(T__1);
			setState(483);
			fof_formula();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(484);
				annotations();
				}
			}

			setState(487);
			match(T__2);
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

	public static class Cnf_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Cnf_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_annotated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterCnf_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitCnf_annotated(this);
		}
	}

	public final Cnf_annotatedContext cnf_annotated() throws RecognitionException {
		Cnf_annotatedContext _localctx = new Cnf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cnf_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__8);
			setState(490);
			name();
			setState(491);
			match(T__1);
			setState(492);
			formula_role();
			setState(493);
			match(T__1);
			setState(494);
			cnf_formula();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(495);
				annotations();
				}
			}

			setState(498);
			match(T__2);
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

	public static class AnnotationsContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Optional_infoContext optional_info() {
			return getRuleContext(Optional_infoContext.class,0);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__1);
			setState(501);
			source();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(502);
				optional_info();
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

	public static class Formula_roleContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(tptp_v7_0_0_0Parser.Lower_word, 0); }
		public Formula_roleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFormula_role(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFormula_role(this);
		}
	}

	public final Formula_roleContext formula_role() throws RecognitionException {
		Formula_roleContext _localctx = new Formula_roleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formula_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(Lower_word);
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

	public static class Thf_formulaContext extends ParserRuleContext {
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_sequentContext thf_sequent() {
			return getRuleContext(Thf_sequentContext.class,0);
		}
		public Thf_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_formula(this);
		}
	}

	public final Thf_formulaContext thf_formula() throws RecognitionException {
		Thf_formulaContext _localctx = new Thf_formulaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_thf_formula);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				thf_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				thf_sequent();
				}
				break;
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

	public static class Thf_logic_formulaContext extends ParserRuleContext {
		public Thf_binary_formulaContext thf_binary_formula() {
			return getRuleContext(Thf_binary_formulaContext.class,0);
		}
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_type_formulaContext thf_type_formula() {
			return getRuleContext(Thf_type_formulaContext.class,0);
		}
		public Thf_subtypeContext thf_subtype() {
			return getRuleContext(Thf_subtypeContext.class,0);
		}
		public Thf_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_logic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_logic_formula(this);
		}
	}

	public final Thf_logic_formulaContext thf_logic_formula() throws RecognitionException {
		Thf_logic_formulaContext _localctx = new Thf_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_thf_logic_formula);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				thf_binary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				thf_unitary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				thf_type_formula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				thf_subtype();
				}
				break;
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

	public static class Thf_binary_formulaContext extends ParserRuleContext {
		public Thf_binary_pairContext thf_binary_pair() {
			return getRuleContext(Thf_binary_pairContext.class,0);
		}
		public Thf_binary_tupleContext thf_binary_tuple() {
			return getRuleContext(Thf_binary_tupleContext.class,0);
		}
		public Thf_binary_typeContext thf_binary_type() {
			return getRuleContext(Thf_binary_typeContext.class,0);
		}
		public Thf_binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_binary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_binary_formula(this);
		}
	}

	public final Thf_binary_formulaContext thf_binary_formula() throws RecognitionException {
		Thf_binary_formulaContext _localctx = new Thf_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_thf_binary_formula);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				thf_binary_pair();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				thf_binary_tuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				thf_binary_type();
				}
				break;
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

	public static class Thf_binary_pairContext extends ParserRuleContext {
		public List<Thf_unitary_formulaContext> thf_unitary_formula() {
			return getRuleContexts(Thf_unitary_formulaContext.class);
		}
		public Thf_unitary_formulaContext thf_unitary_formula(int i) {
			return getRuleContext(Thf_unitary_formulaContext.class,i);
		}
		public Thf_pair_connectiveContext thf_pair_connective() {
			return getRuleContext(Thf_pair_connectiveContext.class,0);
		}
		public Thf_binary_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_binary_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_binary_pair(this);
		}
	}

	public final Thf_binary_pairContext thf_binary_pair() throws RecognitionException {
		Thf_binary_pairContext _localctx = new Thf_binary_pairContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_thf_binary_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			thf_unitary_formula();
			setState(523);
			thf_pair_connective();
			setState(524);
			thf_unitary_formula();
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

	public static class Thf_binary_tupleContext extends ParserRuleContext {
		public Thf_or_formulaContext thf_or_formula() {
			return getRuleContext(Thf_or_formulaContext.class,0);
		}
		public Thf_and_formulaContext thf_and_formula() {
			return getRuleContext(Thf_and_formulaContext.class,0);
		}
		public Thf_apply_formulaContext thf_apply_formula() {
			return getRuleContext(Thf_apply_formulaContext.class,0);
		}
		public Thf_binary_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_binary_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_binary_tuple(this);
		}
	}

	public final Thf_binary_tupleContext thf_binary_tuple() throws RecognitionException {
		Thf_binary_tupleContext _localctx = new Thf_binary_tupleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_thf_binary_tuple);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				thf_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				thf_and_formula(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				thf_apply_formula(0);
				}
				break;
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

	public static class Thf_or_formulaContext extends ParserRuleContext {
		public List<Thf_unitary_formulaContext> thf_unitary_formula() {
			return getRuleContexts(Thf_unitary_formulaContext.class);
		}
		public Thf_unitary_formulaContext thf_unitary_formula(int i) {
			return getRuleContext(Thf_unitary_formulaContext.class,i);
		}
		public TerminalNode Or() { return getToken(tptp_v7_0_0_0Parser.Or, 0); }
		public Thf_or_formulaContext thf_or_formula() {
			return getRuleContext(Thf_or_formulaContext.class,0);
		}
		public Thf_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_or_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_or_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_or_formula(this);
		}
	}

	public final Thf_or_formulaContext thf_or_formula() throws RecognitionException {
		return thf_or_formula(0);
	}

	private Thf_or_formulaContext thf_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_or_formulaContext _localctx = new Thf_or_formulaContext(_ctx, _parentState);
		Thf_or_formulaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_thf_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(532);
			thf_unitary_formula();
			setState(533);
			match(Or);
			setState(534);
			thf_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_or_formula);
					setState(536);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(537);
					match(Or);
					setState(538);
					thf_unitary_formula();
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Thf_and_formulaContext extends ParserRuleContext {
		public List<Thf_unitary_formulaContext> thf_unitary_formula() {
			return getRuleContexts(Thf_unitary_formulaContext.class);
		}
		public Thf_unitary_formulaContext thf_unitary_formula(int i) {
			return getRuleContext(Thf_unitary_formulaContext.class,i);
		}
		public TerminalNode And() { return getToken(tptp_v7_0_0_0Parser.And, 0); }
		public Thf_and_formulaContext thf_and_formula() {
			return getRuleContext(Thf_and_formulaContext.class,0);
		}
		public Thf_and_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_and_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_and_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_and_formula(this);
		}
	}

	public final Thf_and_formulaContext thf_and_formula() throws RecognitionException {
		return thf_and_formula(0);
	}

	private Thf_and_formulaContext thf_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_and_formulaContext _localctx = new Thf_and_formulaContext(_ctx, _parentState);
		Thf_and_formulaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_thf_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(545);
			thf_unitary_formula();
			setState(546);
			match(And);
			setState(547);
			thf_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_and_formula);
					setState(549);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(550);
					match(And);
					setState(551);
					thf_unitary_formula();
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Thf_apply_formulaContext extends ParserRuleContext {
		public List<Thf_unitary_formulaContext> thf_unitary_formula() {
			return getRuleContexts(Thf_unitary_formulaContext.class);
		}
		public Thf_unitary_formulaContext thf_unitary_formula(int i) {
			return getRuleContext(Thf_unitary_formulaContext.class,i);
		}
		public TerminalNode App() { return getToken(tptp_v7_0_0_0Parser.App, 0); }
		public Thf_apply_formulaContext thf_apply_formula() {
			return getRuleContext(Thf_apply_formulaContext.class,0);
		}
		public Thf_apply_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_apply_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_apply_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_apply_formula(this);
		}
	}

	public final Thf_apply_formulaContext thf_apply_formula() throws RecognitionException {
		return thf_apply_formula(0);
	}

	private Thf_apply_formulaContext thf_apply_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_apply_formulaContext _localctx = new Thf_apply_formulaContext(_ctx, _parentState);
		Thf_apply_formulaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_thf_apply_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(558);
			thf_unitary_formula();
			setState(559);
			match(App);
			setState(560);
			thf_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_apply_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_apply_formula);
					setState(562);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(563);
					match(App);
					setState(564);
					thf_unitary_formula();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Thf_unitary_formulaContext extends ParserRuleContext {
		public Thf_quantified_formulaContext thf_quantified_formula() {
			return getRuleContext(Thf_quantified_formulaContext.class,0);
		}
		public Thf_unary_formulaContext thf_unary_formula() {
			return getRuleContext(Thf_unary_formulaContext.class,0);
		}
		public Thf_atomContext thf_atom() {
			return getRuleContext(Thf_atomContext.class,0);
		}
		public Thf_conditionalContext thf_conditional() {
			return getRuleContext(Thf_conditionalContext.class,0);
		}
		public Thf_letContext thf_let() {
			return getRuleContext(Thf_letContext.class,0);
		}
		public Thf_tupleContext thf_tuple() {
			return getRuleContext(Thf_tupleContext.class,0);
		}
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unitary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_unitary_formula(this);
		}
	}

	public final Thf_unitary_formulaContext thf_unitary_formula() throws RecognitionException {
		Thf_unitary_formulaContext _localctx = new Thf_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_thf_unitary_formula);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				thf_quantified_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				thf_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				thf_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				thf_conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				thf_let();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				thf_tuple();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(576);
				match(T__9);
				setState(577);
				thf_logic_formula();
				setState(578);
				match(T__10);
				}
				break;
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

	public static class Thf_quantified_formulaContext extends ParserRuleContext {
		public Thf_quantificationContext thf_quantification() {
			return getRuleContext(Thf_quantificationContext.class,0);
		}
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_quantified_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_quantified_formula(this);
		}
	}

	public final Thf_quantified_formulaContext thf_quantified_formula() throws RecognitionException {
		Thf_quantified_formulaContext _localctx = new Thf_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_thf_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			thf_quantification();
			setState(583);
			thf_unitary_formula();
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

	public static class Thf_quantificationContext extends ParserRuleContext {
		public Thf_quantifierContext thf_quantifier() {
			return getRuleContext(Thf_quantifierContext.class,0);
		}
		public List<Thf_variableContext> thf_variable() {
			return getRuleContexts(Thf_variableContext.class);
		}
		public Thf_variableContext thf_variable(int i) {
			return getRuleContext(Thf_variableContext.class,i);
		}
		public Thf_quantificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_quantification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_quantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_quantification(this);
		}
	}

	public final Thf_quantificationContext thf_quantification() throws RecognitionException {
		Thf_quantificationContext _localctx = new Thf_quantificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_thf_quantification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			thf_quantifier();
			setState(586);
			match(T__11);
			setState(587);
			thf_variable();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(588);
				match(T__1);
				setState(589);
				thf_variable();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			match(T__12);
			setState(596);
			match(T__13);
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

	public static class Thf_variableContext extends ParserRuleContext {
		public Thf_typed_variableContext thf_typed_variable() {
			return getRuleContext(Thf_typed_variableContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Thf_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_variable(this);
		}
	}

	public final Thf_variableContext thf_variable() throws RecognitionException {
		Thf_variableContext _localctx = new Thf_variableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_thf_variable);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				thf_typed_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				variable();
				}
				break;
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

	public static class Thf_typed_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Thf_top_level_typeContext thf_top_level_type() {
			return getRuleContext(Thf_top_level_typeContext.class,0);
		}
		public Thf_typed_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_typed_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_typed_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_typed_variable(this);
		}
	}

	public final Thf_typed_variableContext thf_typed_variable() throws RecognitionException {
		Thf_typed_variableContext _localctx = new Thf_typed_variableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_thf_typed_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			variable();
			setState(603);
			match(T__13);
			setState(604);
			thf_top_level_type();
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

	public static class Thf_unary_formulaContext extends ParserRuleContext {
		public Thf_unary_connectiveContext thf_unary_connective() {
			return getRuleContext(Thf_unary_connectiveContext.class,0);
		}
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_unary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_unary_formula(this);
		}
	}

	public final Thf_unary_formulaContext thf_unary_formula() throws RecognitionException {
		Thf_unary_formulaContext _localctx = new Thf_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_thf_unary_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			thf_unary_connective();
			setState(607);
			match(T__9);
			setState(608);
			thf_logic_formula();
			setState(609);
			match(T__10);
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

	public static class Thf_atomContext extends ParserRuleContext {
		public Thf_functionContext thf_function() {
			return getRuleContext(Thf_functionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Defined_termContext defined_term() {
			return getRuleContext(Defined_termContext.class,0);
		}
		public Thf_conn_termContext thf_conn_term() {
			return getRuleContext(Thf_conn_termContext.class,0);
		}
		public Thf_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_atom(this);
		}
	}

	public final Thf_atomContext thf_atom() throws RecognitionException {
		Thf_atomContext _localctx = new Thf_atomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_thf_atom);
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_word:
			case Dollar_dollar_word:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				thf_function();
				}
				break;
			case Upper_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				variable();
				}
				break;
			case Real:
			case Rational:
			case Integer:
			case Distinct_object:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				defined_term();
				}
				break;
			case Or:
			case And:
			case Iff:
			case Impl:
			case If:
			case Niff:
			case Nor:
			case Nand:
			case Not:
			case ForallComb:
			case Infix_inequality:
			case Infix_equality:
			case ExistsComb:
			case ChoiceComb:
			case DescriptionComb:
			case EqComb:
			case Assignment:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				thf_conn_term();
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

	public static class Thf_functionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public Thf_argumentsContext thf_arguments() {
			return getRuleContext(Thf_argumentsContext.class,0);
		}
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public Thf_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_function(this);
		}
	}

	public final Thf_functionContext thf_function() throws RecognitionException {
		Thf_functionContext _localctx = new Thf_functionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_thf_function);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				functor();
				setState(619);
				match(T__9);
				setState(620);
				thf_arguments();
				setState(621);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				defined_functor();
				setState(624);
				match(T__9);
				setState(625);
				thf_arguments();
				setState(626);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				system_functor();
				setState(629);
				match(T__9);
				setState(630);
				thf_arguments();
				setState(631);
				match(T__10);
				}
				break;
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

	public static class Thf_conn_termContext extends ParserRuleContext {
		public Thf_pair_connectiveContext thf_pair_connective() {
			return getRuleContext(Thf_pair_connectiveContext.class,0);
		}
		public Assoc_connectiveContext assoc_connective() {
			return getRuleContext(Assoc_connectiveContext.class,0);
		}
		public Thf_unary_connectiveContext thf_unary_connective() {
			return getRuleContext(Thf_unary_connectiveContext.class,0);
		}
		public Thf_conn_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_conn_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_conn_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_conn_term(this);
		}
	}

	public final Thf_conn_termContext thf_conn_term() throws RecognitionException {
		Thf_conn_termContext _localctx = new Thf_conn_termContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_thf_conn_term);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Iff:
			case Impl:
			case If:
			case Niff:
			case Nor:
			case Nand:
			case Infix_inequality:
			case Infix_equality:
			case Assignment:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				thf_pair_connective();
				}
				break;
			case Or:
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				assoc_connective();
				}
				break;
			case Not:
			case ForallComb:
			case ExistsComb:
			case ChoiceComb:
			case DescriptionComb:
			case EqComb:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				thf_unary_connective();
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

	public static class Thf_conditionalContext extends ParserRuleContext {
		public List<Thf_logic_formulaContext> thf_logic_formula() {
			return getRuleContexts(Thf_logic_formulaContext.class);
		}
		public Thf_logic_formulaContext thf_logic_formula(int i) {
			return getRuleContext(Thf_logic_formulaContext.class,i);
		}
		public Thf_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_conditional(this);
		}
	}

	public final Thf_conditionalContext thf_conditional() throws RecognitionException {
		Thf_conditionalContext _localctx = new Thf_conditionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_thf_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(T__14);
			setState(641);
			thf_logic_formula();
			setState(642);
			match(T__1);
			setState(643);
			thf_logic_formula();
			setState(644);
			match(T__1);
			setState(645);
			thf_logic_formula();
			setState(646);
			match(T__10);
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

	public static class Thf_letContext extends ParserRuleContext {
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_formulaContext thf_formula() {
			return getRuleContext(Thf_formulaContext.class,0);
		}
		public Thf_letContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_let(this);
		}
	}

	public final Thf_letContext thf_let() throws RecognitionException {
		Thf_letContext _localctx = new Thf_letContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_thf_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(T__15);
			setState(649);
			thf_unitary_formula();
			setState(650);
			match(T__1);
			setState(651);
			thf_formula();
			setState(652);
			match(T__10);
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

	public static class Thf_argumentsContext extends ParserRuleContext {
		public Thf_formula_listContext thf_formula_list() {
			return getRuleContext(Thf_formula_listContext.class,0);
		}
		public Thf_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_arguments(this);
		}
	}

	public final Thf_argumentsContext thf_arguments() throws RecognitionException {
		Thf_argumentsContext _localctx = new Thf_argumentsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_thf_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			thf_formula_list();
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

	public static class Thf_type_formulaContext extends ParserRuleContext {
		public Thf_typeable_formulaContext thf_typeable_formula() {
			return getRuleContext(Thf_typeable_formulaContext.class,0);
		}
		public Thf_top_level_typeContext thf_top_level_type() {
			return getRuleContext(Thf_top_level_typeContext.class,0);
		}
		public Thf_type_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_type_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_type_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_type_formula(this);
		}
	}

	public final Thf_type_formulaContext thf_type_formula() throws RecognitionException {
		Thf_type_formulaContext _localctx = new Thf_type_formulaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_thf_type_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			thf_typeable_formula();
			setState(657);
			match(T__13);
			setState(658);
			thf_top_level_type();
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

	public static class Thf_typeable_formulaContext extends ParserRuleContext {
		public Thf_atomContext thf_atom() {
			return getRuleContext(Thf_atomContext.class,0);
		}
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_typeable_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_typeable_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_typeable_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_typeable_formula(this);
		}
	}

	public final Thf_typeable_formulaContext thf_typeable_formula() throws RecognitionException {
		Thf_typeable_formulaContext _localctx = new Thf_typeable_formulaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_thf_typeable_formula);
		try {
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Or:
			case And:
			case Iff:
			case Impl:
			case If:
			case Niff:
			case Nor:
			case Nand:
			case Not:
			case ForallComb:
			case Infix_inequality:
			case Infix_equality:
			case ExistsComb:
			case ChoiceComb:
			case DescriptionComb:
			case EqComb:
			case Assignment:
			case Real:
			case Rational:
			case Integer:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Single_quoted:
			case Distinct_object:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				thf_atom();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(T__9);
				setState(662);
				thf_logic_formula();
				setState(663);
				match(T__10);
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

	public static class Thf_subtypeContext extends ParserRuleContext {
		public List<Thf_atomContext> thf_atom() {
			return getRuleContexts(Thf_atomContext.class);
		}
		public Thf_atomContext thf_atom(int i) {
			return getRuleContext(Thf_atomContext.class,i);
		}
		public TerminalNode Subtype_sign() { return getToken(tptp_v7_0_0_0Parser.Subtype_sign, 0); }
		public Thf_subtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_subtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_subtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_subtype(this);
		}
	}

	public final Thf_subtypeContext thf_subtype() throws RecognitionException {
		Thf_subtypeContext _localctx = new Thf_subtypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_thf_subtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			thf_atom();
			setState(668);
			match(Subtype_sign);
			setState(669);
			thf_atom();
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

	public static class Thf_top_level_typeContext extends ParserRuleContext {
		public Thf_unitary_typeContext thf_unitary_type() {
			return getRuleContext(Thf_unitary_typeContext.class,0);
		}
		public Thf_mapping_typeContext thf_mapping_type() {
			return getRuleContext(Thf_mapping_typeContext.class,0);
		}
		public Thf_apply_typeContext thf_apply_type() {
			return getRuleContext(Thf_apply_typeContext.class,0);
		}
		public Thf_top_level_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_top_level_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_top_level_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_top_level_type(this);
		}
	}

	public final Thf_top_level_typeContext thf_top_level_type() throws RecognitionException {
		Thf_top_level_typeContext _localctx = new Thf_top_level_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_thf_top_level_type);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				thf_unitary_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				thf_mapping_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				thf_apply_type();
				}
				break;
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

	public static class Thf_unitary_typeContext extends ParserRuleContext {
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_unitary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unitary_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_unitary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_unitary_type(this);
		}
	}

	public final Thf_unitary_typeContext thf_unitary_type() throws RecognitionException {
		Thf_unitary_typeContext _localctx = new Thf_unitary_typeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_thf_unitary_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			thf_unitary_formula();
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

	public static class Thf_apply_typeContext extends ParserRuleContext {
		public Thf_apply_formulaContext thf_apply_formula() {
			return getRuleContext(Thf_apply_formulaContext.class,0);
		}
		public Thf_apply_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_apply_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_apply_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_apply_type(this);
		}
	}

	public final Thf_apply_typeContext thf_apply_type() throws RecognitionException {
		Thf_apply_typeContext _localctx = new Thf_apply_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_thf_apply_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			thf_apply_formula(0);
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

	public static class Thf_binary_typeContext extends ParserRuleContext {
		public Thf_mapping_typeContext thf_mapping_type() {
			return getRuleContext(Thf_mapping_typeContext.class,0);
		}
		public Thf_xprod_typeContext thf_xprod_type() {
			return getRuleContext(Thf_xprod_typeContext.class,0);
		}
		public Thf_union_typeContext thf_union_type() {
			return getRuleContext(Thf_union_typeContext.class,0);
		}
		public Thf_binary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_binary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_binary_type(this);
		}
	}

	public final Thf_binary_typeContext thf_binary_type() throws RecognitionException {
		Thf_binary_typeContext _localctx = new Thf_binary_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_thf_binary_type);
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				thf_mapping_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				thf_xprod_type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				thf_union_type(0);
				}
				break;
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

	public static class Thf_mapping_typeContext extends ParserRuleContext {
		public List<Thf_unitary_typeContext> thf_unitary_type() {
			return getRuleContexts(Thf_unitary_typeContext.class);
		}
		public Thf_unitary_typeContext thf_unitary_type(int i) {
			return getRuleContext(Thf_unitary_typeContext.class,i);
		}
		public TerminalNode Arrow() { return getToken(tptp_v7_0_0_0Parser.Arrow, 0); }
		public Thf_mapping_typeContext thf_mapping_type() {
			return getRuleContext(Thf_mapping_typeContext.class,0);
		}
		public Thf_mapping_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_mapping_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_mapping_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_mapping_type(this);
		}
	}

	public final Thf_mapping_typeContext thf_mapping_type() throws RecognitionException {
		Thf_mapping_typeContext _localctx = new Thf_mapping_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_thf_mapping_type);
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				thf_unitary_type();
				setState(686);
				match(Arrow);
				setState(687);
				thf_unitary_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				thf_unitary_type();
				setState(690);
				match(Arrow);
				setState(691);
				thf_mapping_type();
				}
				break;
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

	public static class Thf_xprod_typeContext extends ParserRuleContext {
		public List<Thf_unitary_typeContext> thf_unitary_type() {
			return getRuleContexts(Thf_unitary_typeContext.class);
		}
		public Thf_unitary_typeContext thf_unitary_type(int i) {
			return getRuleContext(Thf_unitary_typeContext.class,i);
		}
		public TerminalNode Star() { return getToken(tptp_v7_0_0_0Parser.Star, 0); }
		public Thf_xprod_typeContext thf_xprod_type() {
			return getRuleContext(Thf_xprod_typeContext.class,0);
		}
		public Thf_xprod_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_xprod_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_xprod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_xprod_type(this);
		}
	}

	public final Thf_xprod_typeContext thf_xprod_type() throws RecognitionException {
		return thf_xprod_type(0);
	}

	private Thf_xprod_typeContext thf_xprod_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_xprod_typeContext _localctx = new Thf_xprod_typeContext(_ctx, _parentState);
		Thf_xprod_typeContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_thf_xprod_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(696);
			thf_unitary_type();
			setState(697);
			match(Star);
			setState(698);
			thf_unitary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_xprod_typeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_xprod_type);
					setState(700);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(701);
					match(Star);
					setState(702);
					thf_unitary_type();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Thf_union_typeContext extends ParserRuleContext {
		public List<Thf_unitary_typeContext> thf_unitary_type() {
			return getRuleContexts(Thf_unitary_typeContext.class);
		}
		public Thf_unitary_typeContext thf_unitary_type(int i) {
			return getRuleContext(Thf_unitary_typeContext.class,i);
		}
		public TerminalNode Plus() { return getToken(tptp_v7_0_0_0Parser.Plus, 0); }
		public Thf_union_typeContext thf_union_type() {
			return getRuleContext(Thf_union_typeContext.class,0);
		}
		public Thf_union_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_union_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_union_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_union_type(this);
		}
	}

	public final Thf_union_typeContext thf_union_type() throws RecognitionException {
		return thf_union_type(0);
	}

	private Thf_union_typeContext thf_union_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_union_typeContext _localctx = new Thf_union_typeContext(_ctx, _parentState);
		Thf_union_typeContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_thf_union_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(709);
			thf_unitary_type();
			setState(710);
			match(Plus);
			setState(711);
			thf_unitary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_union_typeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_union_type);
					setState(713);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(714);
					match(Plus);
					setState(715);
					thf_unitary_type();
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Thf_sequentContext extends ParserRuleContext {
		public List<Thf_tupleContext> thf_tuple() {
			return getRuleContexts(Thf_tupleContext.class);
		}
		public Thf_tupleContext thf_tuple(int i) {
			return getRuleContext(Thf_tupleContext.class,i);
		}
		public TerminalNode Gentzen_arrow() { return getToken(tptp_v7_0_0_0Parser.Gentzen_arrow, 0); }
		public Thf_sequentContext thf_sequent() {
			return getRuleContext(Thf_sequentContext.class,0);
		}
		public Thf_sequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_sequent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_sequent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_sequent(this);
		}
	}

	public final Thf_sequentContext thf_sequent() throws RecognitionException {
		Thf_sequentContext _localctx = new Thf_sequentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_thf_sequent);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				thf_tuple();
				setState(722);
				match(Gentzen_arrow);
				setState(723);
				thf_tuple();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(T__9);
				setState(726);
				thf_sequent();
				setState(727);
				match(T__10);
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

	public static class Thf_tupleContext extends ParserRuleContext {
		public Thf_formula_listContext thf_formula_list() {
			return getRuleContext(Thf_formula_listContext.class,0);
		}
		public Thf_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_tuple(this);
		}
	}

	public final Thf_tupleContext thf_tuple() throws RecognitionException {
		Thf_tupleContext _localctx = new Thf_tupleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_thf_tuple);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(T__16);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(T__11);
				setState(733);
				thf_formula_list();
				setState(734);
				match(T__12);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				match(T__18);
				setState(738);
				thf_formula_list();
				setState(739);
				match(T__19);
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

	public static class Thf_formula_listContext extends ParserRuleContext {
		public List<Thf_logic_formulaContext> thf_logic_formula() {
			return getRuleContexts(Thf_logic_formulaContext.class);
		}
		public Thf_logic_formulaContext thf_logic_formula(int i) {
			return getRuleContext(Thf_logic_formulaContext.class,i);
		}
		public Thf_formula_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_formula_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_formula_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_formula_list(this);
		}
	}

	public final Thf_formula_listContext thf_formula_list() throws RecognitionException {
		Thf_formula_listContext _localctx = new Thf_formula_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_thf_formula_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			thf_logic_formula();
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(744);
				match(T__1);
				setState(745);
				thf_logic_formula();
				}
				}
				setState(750);
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

	public static class Tfx_formulaContext extends ParserRuleContext {
		public Tfx_logic_formulaContext tfx_logic_formula() {
			return getRuleContext(Tfx_logic_formulaContext.class,0);
		}
		public Thf_sequentContext thf_sequent() {
			return getRuleContext(Thf_sequentContext.class,0);
		}
		public Tfx_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfx_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTfx_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTfx_formula(this);
		}
	}

	public final Tfx_formulaContext tfx_formula() throws RecognitionException {
		Tfx_formulaContext _localctx = new Tfx_formulaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tfx_formula);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				tfx_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				thf_sequent();
				}
				break;
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

	public static class Tfx_logic_formulaContext extends ParserRuleContext {
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Tfx_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfx_logic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTfx_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTfx_logic_formula(this);
		}
	}

	public final Tfx_logic_formulaContext tfx_logic_formula() throws RecognitionException {
		Tfx_logic_formulaContext _localctx = new Tfx_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tfx_logic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			thf_logic_formula();
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

	public static class Tff_formulaContext extends ParserRuleContext {
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Tff_typed_atomContext tff_typed_atom() {
			return getRuleContext(Tff_typed_atomContext.class,0);
		}
		public Tff_sequentContext tff_sequent() {
			return getRuleContext(Tff_sequentContext.class,0);
		}
		public Tff_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_formula(this);
		}
	}

	public final Tff_formulaContext tff_formula() throws RecognitionException {
		Tff_formulaContext _localctx = new Tff_formulaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tff_formula);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				tff_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				tff_typed_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				tff_sequent();
				}
				break;
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

	public static class Tff_logic_formulaContext extends ParserRuleContext {
		public Tff_binary_formulaContext tff_binary_formula() {
			return getRuleContext(Tff_binary_formulaContext.class,0);
		}
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_subtypeContext tff_subtype() {
			return getRuleContext(Tff_subtypeContext.class,0);
		}
		public Tff_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_logic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_logic_formula(this);
		}
	}

	public final Tff_logic_formulaContext tff_logic_formula() throws RecognitionException {
		Tff_logic_formulaContext _localctx = new Tff_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tff_logic_formula);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				tff_binary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				tff_unitary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				tff_subtype();
				}
				break;
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

	public static class Tff_binary_formulaContext extends ParserRuleContext {
		public Tff_binary_nonassocContext tff_binary_nonassoc() {
			return getRuleContext(Tff_binary_nonassocContext.class,0);
		}
		public Tff_binary_assocContext tff_binary_assoc() {
			return getRuleContext(Tff_binary_assocContext.class,0);
		}
		public Tff_binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_binary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_binary_formula(this);
		}
	}

	public final Tff_binary_formulaContext tff_binary_formula() throws RecognitionException {
		Tff_binary_formulaContext _localctx = new Tff_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tff_binary_formula);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				tff_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				tff_binary_assoc();
				}
				break;
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

	public static class Tff_binary_nonassocContext extends ParserRuleContext {
		public List<Tff_unitary_formulaContext> tff_unitary_formula() {
			return getRuleContexts(Tff_unitary_formulaContext.class);
		}
		public Tff_unitary_formulaContext tff_unitary_formula(int i) {
			return getRuleContext(Tff_unitary_formulaContext.class,i);
		}
		public Binary_connectiveContext binary_connective() {
			return getRuleContext(Binary_connectiveContext.class,0);
		}
		public Tff_binary_nonassocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_nonassoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_binary_nonassoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_binary_nonassoc(this);
		}
	}

	public final Tff_binary_nonassocContext tff_binary_nonassoc() throws RecognitionException {
		Tff_binary_nonassocContext _localctx = new Tff_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tff_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			tff_unitary_formula();
			setState(772);
			binary_connective();
			setState(773);
			tff_unitary_formula();
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

	public static class Tff_binary_assocContext extends ParserRuleContext {
		public Tff_or_formulaContext tff_or_formula() {
			return getRuleContext(Tff_or_formulaContext.class,0);
		}
		public Tff_and_formulaContext tff_and_formula() {
			return getRuleContext(Tff_and_formulaContext.class,0);
		}
		public Tff_binary_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_assoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_binary_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_binary_assoc(this);
		}
	}

	public final Tff_binary_assocContext tff_binary_assoc() throws RecognitionException {
		Tff_binary_assocContext _localctx = new Tff_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tff_binary_assoc);
		try {
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				tff_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				tff_and_formula(0);
				}
				break;
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

	public static class Tff_or_formulaContext extends ParserRuleContext {
		public List<Tff_unitary_formulaContext> tff_unitary_formula() {
			return getRuleContexts(Tff_unitary_formulaContext.class);
		}
		public Tff_unitary_formulaContext tff_unitary_formula(int i) {
			return getRuleContext(Tff_unitary_formulaContext.class,i);
		}
		public TerminalNode Or() { return getToken(tptp_v7_0_0_0Parser.Or, 0); }
		public Tff_or_formulaContext tff_or_formula() {
			return getRuleContext(Tff_or_formulaContext.class,0);
		}
		public Tff_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_or_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_or_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_or_formula(this);
		}
	}

	public final Tff_or_formulaContext tff_or_formula() throws RecognitionException {
		return tff_or_formula(0);
	}

	private Tff_or_formulaContext tff_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_or_formulaContext _localctx = new Tff_or_formulaContext(_ctx, _parentState);
		Tff_or_formulaContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_tff_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(780);
			tff_unitary_formula();
			setState(781);
			match(Or);
			setState(782);
			tff_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_or_formula);
					setState(784);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(785);
					match(Or);
					setState(786);
					tff_unitary_formula();
					}
					} 
				}
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tff_and_formulaContext extends ParserRuleContext {
		public List<Tff_unitary_formulaContext> tff_unitary_formula() {
			return getRuleContexts(Tff_unitary_formulaContext.class);
		}
		public Tff_unitary_formulaContext tff_unitary_formula(int i) {
			return getRuleContext(Tff_unitary_formulaContext.class,i);
		}
		public TerminalNode And() { return getToken(tptp_v7_0_0_0Parser.And, 0); }
		public Tff_and_formulaContext tff_and_formula() {
			return getRuleContext(Tff_and_formulaContext.class,0);
		}
		public Tff_and_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_and_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_and_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_and_formula(this);
		}
	}

	public final Tff_and_formulaContext tff_and_formula() throws RecognitionException {
		return tff_and_formula(0);
	}

	private Tff_and_formulaContext tff_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_and_formulaContext _localctx = new Tff_and_formulaContext(_ctx, _parentState);
		Tff_and_formulaContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_tff_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(793);
			tff_unitary_formula();
			setState(794);
			match(And);
			setState(795);
			tff_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_and_formula);
					setState(797);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(798);
					match(And);
					setState(799);
					tff_unitary_formula();
					}
					} 
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tff_unitary_formulaContext extends ParserRuleContext {
		public Tff_quantified_formulaContext tff_quantified_formula() {
			return getRuleContext(Tff_quantified_formulaContext.class,0);
		}
		public Tff_unary_formulaContext tff_unary_formula() {
			return getRuleContext(Tff_unary_formulaContext.class,0);
		}
		public Tff_atomic_formulaContext tff_atomic_formula() {
			return getRuleContext(Tff_atomic_formulaContext.class,0);
		}
		public Tff_conditionalContext tff_conditional() {
			return getRuleContext(Tff_conditionalContext.class,0);
		}
		public Tff_letContext tff_let() {
			return getRuleContext(Tff_letContext.class,0);
		}
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Tff_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unitary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_unitary_formula(this);
		}
	}

	public final Tff_unitary_formulaContext tff_unitary_formula() throws RecognitionException {
		Tff_unitary_formulaContext _localctx = new Tff_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tff_unitary_formula);
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				tff_quantified_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				tff_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				tff_atomic_formula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(808);
				tff_conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(809);
				tff_let();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(810);
				match(T__9);
				setState(811);
				tff_logic_formula();
				setState(812);
				match(T__10);
				}
				break;
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

	public static class Tff_quantified_formulaContext extends ParserRuleContext {
		public Fof_quantifierContext fof_quantifier() {
			return getRuleContext(Fof_quantifierContext.class,0);
		}
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_quantified_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_quantified_formula(this);
		}
	}

	public final Tff_quantified_formulaContext tff_quantified_formula() throws RecognitionException {
		Tff_quantified_formulaContext _localctx = new Tff_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tff_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			fof_quantifier();
			setState(817);
			match(T__11);
			setState(818);
			tff_variable_list();
			setState(819);
			match(T__12);
			setState(820);
			match(T__13);
			setState(821);
			tff_unitary_formula();
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

	public static class Tff_variable_listContext extends ParserRuleContext {
		public List<Tff_variableContext> tff_variable() {
			return getRuleContexts(Tff_variableContext.class);
		}
		public Tff_variableContext tff_variable(int i) {
			return getRuleContext(Tff_variableContext.class,i);
		}
		public Tff_variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_variable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_variable_list(this);
		}
	}

	public final Tff_variable_listContext tff_variable_list() throws RecognitionException {
		Tff_variable_listContext _localctx = new Tff_variable_listContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tff_variable_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			tff_variable();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(824);
				match(T__1);
				setState(825);
				tff_variable();
				}
				}
				setState(830);
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

	public static class Tff_variableContext extends ParserRuleContext {
		public Tff_typed_variableContext tff_typed_variable() {
			return getRuleContext(Tff_typed_variableContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Tff_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_variable(this);
		}
	}

	public final Tff_variableContext tff_variable() throws RecognitionException {
		Tff_variableContext _localctx = new Tff_variableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tff_variable);
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				tff_typed_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				variable();
				}
				break;
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

	public static class Tff_typed_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_typed_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_typed_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_typed_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_typed_variable(this);
		}
	}

	public final Tff_typed_variableContext tff_typed_variable() throws RecognitionException {
		Tff_typed_variableContext _localctx = new Tff_typed_variableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tff_typed_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			variable();
			setState(836);
			match(T__13);
			setState(837);
			tff_atomic_type();
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

	public static class Tff_unary_formulaContext extends ParserRuleContext {
		public Unary_connectiveContext unary_connective() {
			return getRuleContext(Unary_connectiveContext.class,0);
		}
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Fof_infix_unaryContext fof_infix_unary() {
			return getRuleContext(Fof_infix_unaryContext.class,0);
		}
		public Tff_unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_unary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_unary_formula(this);
		}
	}

	public final Tff_unary_formulaContext tff_unary_formula() throws RecognitionException {
		Tff_unary_formulaContext _localctx = new Tff_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tff_unary_formula);
		try {
			setState(843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				unary_connective();
				setState(840);
				tff_unitary_formula();
				}
				break;
			case T__17:
			case T__18:
			case T__23:
			case T__24:
			case T__25:
			case Real:
			case Rational:
			case Integer:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Single_quoted:
			case Distinct_object:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				fof_infix_unary();
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

	public static class Tff_atomic_formulaContext extends ParserRuleContext {
		public Fof_atomic_formulaContext fof_atomic_formula() {
			return getRuleContext(Fof_atomic_formulaContext.class,0);
		}
		public Tff_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_atomic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_atomic_formula(this);
		}
	}

	public final Tff_atomic_formulaContext tff_atomic_formula() throws RecognitionException {
		Tff_atomic_formulaContext _localctx = new Tff_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tff_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			fof_atomic_formula();
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

	public static class Tff_conditionalContext extends ParserRuleContext {
		public List<Tff_logic_formulaContext> tff_logic_formula() {
			return getRuleContexts(Tff_logic_formulaContext.class);
		}
		public Tff_logic_formulaContext tff_logic_formula(int i) {
			return getRuleContext(Tff_logic_formulaContext.class,i);
		}
		public Tff_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_conditional(this);
		}
	}

	public final Tff_conditionalContext tff_conditional() throws RecognitionException {
		Tff_conditionalContext _localctx = new Tff_conditionalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tff_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(T__20);
			setState(848);
			tff_logic_formula();
			setState(849);
			match(T__1);
			setState(850);
			tff_logic_formula();
			setState(851);
			match(T__1);
			setState(852);
			tff_logic_formula();
			setState(853);
			match(T__10);
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

	public static class Tff_letContext extends ParserRuleContext {
		public Tff_let_term_defnsContext tff_let_term_defns() {
			return getRuleContext(Tff_let_term_defnsContext.class,0);
		}
		public Tff_formulaContext tff_formula() {
			return getRuleContext(Tff_formulaContext.class,0);
		}
		public Tff_let_formula_defnsContext tff_let_formula_defns() {
			return getRuleContext(Tff_let_formula_defnsContext.class,0);
		}
		public Tff_letContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let(this);
		}
	}

	public final Tff_letContext tff_let() throws RecognitionException {
		Tff_letContext _localctx = new Tff_letContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tff_let);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(T__21);
				setState(856);
				tff_let_term_defns();
				setState(857);
				match(T__1);
				setState(858);
				tff_formula();
				setState(859);
				match(T__10);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(T__22);
				setState(862);
				tff_let_formula_defns();
				setState(863);
				match(T__1);
				setState(864);
				tff_formula();
				setState(865);
				match(T__10);
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

	public static class Tff_let_term_defnsContext extends ParserRuleContext {
		public Tff_let_term_defnContext tff_let_term_defn() {
			return getRuleContext(Tff_let_term_defnContext.class,0);
		}
		public Tff_let_term_listContext tff_let_term_list() {
			return getRuleContext(Tff_let_term_listContext.class,0);
		}
		public Tff_let_term_defnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_term_defns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_term_defns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_term_defns(this);
		}
	}

	public final Tff_let_term_defnsContext tff_let_term_defns() throws RecognitionException {
		Tff_let_term_defnsContext _localctx = new Tff_let_term_defnsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tff_let_term_defns);
		try {
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case Forall:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				tff_let_term_defn();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(T__11);
				setState(871);
				tff_let_term_list();
				setState(872);
				match(T__12);
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

	public static class Tff_let_term_listContext extends ParserRuleContext {
		public List<Tff_let_term_defnContext> tff_let_term_defn() {
			return getRuleContexts(Tff_let_term_defnContext.class);
		}
		public Tff_let_term_defnContext tff_let_term_defn(int i) {
			return getRuleContext(Tff_let_term_defnContext.class,i);
		}
		public Tff_let_term_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_term_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_term_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_term_list(this);
		}
	}

	public final Tff_let_term_listContext tff_let_term_list() throws RecognitionException {
		Tff_let_term_listContext _localctx = new Tff_let_term_listContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_tff_let_term_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			tff_let_term_defn();
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(877);
				match(T__1);
				setState(878);
				tff_let_term_defn();
				}
				}
				setState(883);
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

	public static class Tff_let_term_defnContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(tptp_v7_0_0_0Parser.Forall, 0); }
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tff_let_term_defnContext tff_let_term_defn() {
			return getRuleContext(Tff_let_term_defnContext.class,0);
		}
		public Tff_let_term_bindingContext tff_let_term_binding() {
			return getRuleContext(Tff_let_term_bindingContext.class,0);
		}
		public Tff_let_term_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_term_defn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_term_defn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_term_defn(this);
		}
	}

	public final Tff_let_term_defnContext tff_let_term_defn() throws RecognitionException {
		Tff_let_term_defnContext _localctx = new Tff_let_term_defnContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_tff_let_term_defn);
		try {
			setState(892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Forall:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				match(Forall);
				setState(885);
				match(T__11);
				setState(886);
				tff_variable_list();
				setState(887);
				match(T__12);
				setState(888);
				match(T__13);
				setState(889);
				tff_let_term_defn();
				}
				break;
			case T__9:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				tff_let_term_binding();
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

	public static class Tff_let_term_bindingContext extends ParserRuleContext {
		public Fof_plain_termContext fof_plain_term() {
			return getRuleContext(Fof_plain_termContext.class,0);
		}
		public TerminalNode Infix_equality() { return getToken(tptp_v7_0_0_0Parser.Infix_equality, 0); }
		public Fof_termContext fof_term() {
			return getRuleContext(Fof_termContext.class,0);
		}
		public Tff_let_term_bindingContext tff_let_term_binding() {
			return getRuleContext(Tff_let_term_bindingContext.class,0);
		}
		public Tff_let_term_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_term_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_term_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_term_binding(this);
		}
	}

	public final Tff_let_term_bindingContext tff_let_term_binding() throws RecognitionException {
		Tff_let_term_bindingContext _localctx = new Tff_let_term_bindingContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tff_let_term_binding);
		try {
			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				fof_plain_term();
				setState(895);
				match(Infix_equality);
				setState(896);
				fof_term();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				match(T__9);
				setState(899);
				tff_let_term_binding();
				setState(900);
				match(T__10);
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

	public static class Tff_let_formula_defnsContext extends ParserRuleContext {
		public Tff_let_formula_defnContext tff_let_formula_defn() {
			return getRuleContext(Tff_let_formula_defnContext.class,0);
		}
		public Tff_let_formula_listContext tff_let_formula_list() {
			return getRuleContext(Tff_let_formula_listContext.class,0);
		}
		public Tff_let_formula_defnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_formula_defns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_formula_defns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_formula_defns(this);
		}
	}

	public final Tff_let_formula_defnsContext tff_let_formula_defns() throws RecognitionException {
		Tff_let_formula_defnsContext _localctx = new Tff_let_formula_defnsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tff_let_formula_defns);
		try {
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case Forall:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				tff_let_formula_defn();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(T__11);
				setState(906);
				tff_let_formula_list();
				setState(907);
				match(T__12);
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

	public static class Tff_let_formula_listContext extends ParserRuleContext {
		public List<Tff_let_formula_defnContext> tff_let_formula_defn() {
			return getRuleContexts(Tff_let_formula_defnContext.class);
		}
		public Tff_let_formula_defnContext tff_let_formula_defn(int i) {
			return getRuleContext(Tff_let_formula_defnContext.class,i);
		}
		public Tff_let_formula_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_formula_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_formula_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_formula_list(this);
		}
	}

	public final Tff_let_formula_listContext tff_let_formula_list() throws RecognitionException {
		Tff_let_formula_listContext _localctx = new Tff_let_formula_listContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tff_let_formula_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			tff_let_formula_defn();
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(912);
				match(T__1);
				setState(913);
				tff_let_formula_defn();
				}
				}
				setState(918);
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

	public static class Tff_let_formula_defnContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(tptp_v7_0_0_0Parser.Forall, 0); }
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tff_let_formula_defnContext tff_let_formula_defn() {
			return getRuleContext(Tff_let_formula_defnContext.class,0);
		}
		public Tff_let_formula_bindingContext tff_let_formula_binding() {
			return getRuleContext(Tff_let_formula_bindingContext.class,0);
		}
		public Tff_let_formula_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_formula_defn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_formula_defn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_formula_defn(this);
		}
	}

	public final Tff_let_formula_defnContext tff_let_formula_defn() throws RecognitionException {
		Tff_let_formula_defnContext _localctx = new Tff_let_formula_defnContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_tff_let_formula_defn);
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Forall:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				match(Forall);
				setState(920);
				match(T__11);
				setState(921);
				tff_variable_list();
				setState(922);
				match(T__12);
				setState(923);
				match(T__13);
				setState(924);
				tff_let_formula_defn();
				}
				break;
			case T__9:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				tff_let_formula_binding();
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

	public static class Tff_let_formula_bindingContext extends ParserRuleContext {
		public Fof_plain_atomic_formulaContext fof_plain_atomic_formula() {
			return getRuleContext(Fof_plain_atomic_formulaContext.class,0);
		}
		public TerminalNode Iff() { return getToken(tptp_v7_0_0_0Parser.Iff, 0); }
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_let_formula_bindingContext tff_let_formula_binding() {
			return getRuleContext(Tff_let_formula_bindingContext.class,0);
		}
		public Tff_let_formula_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_formula_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_formula_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_formula_binding(this);
		}
	}

	public final Tff_let_formula_bindingContext tff_let_formula_binding() throws RecognitionException {
		Tff_let_formula_bindingContext _localctx = new Tff_let_formula_bindingContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tff_let_formula_binding);
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				fof_plain_atomic_formula();
				setState(930);
				match(Iff);
				setState(931);
				tff_unitary_formula();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				match(T__9);
				setState(934);
				tff_let_formula_binding();
				setState(935);
				match(T__10);
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

	public static class Tff_sequentContext extends ParserRuleContext {
		public List<Tff_formula_tupleContext> tff_formula_tuple() {
			return getRuleContexts(Tff_formula_tupleContext.class);
		}
		public Tff_formula_tupleContext tff_formula_tuple(int i) {
			return getRuleContext(Tff_formula_tupleContext.class,i);
		}
		public TerminalNode Gentzen_arrow() { return getToken(tptp_v7_0_0_0Parser.Gentzen_arrow, 0); }
		public Tff_sequentContext tff_sequent() {
			return getRuleContext(Tff_sequentContext.class,0);
		}
		public Tff_sequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_sequent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_sequent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_sequent(this);
		}
	}

	public final Tff_sequentContext tff_sequent() throws RecognitionException {
		Tff_sequentContext _localctx = new Tff_sequentContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tff_sequent);
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				tff_formula_tuple();
				setState(940);
				match(Gentzen_arrow);
				setState(941);
				tff_formula_tuple();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(T__9);
				setState(944);
				tff_sequent();
				setState(945);
				match(T__10);
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

	public static class Tff_formula_tupleContext extends ParserRuleContext {
		public Tff_formula_tuple_listContext tff_formula_tuple_list() {
			return getRuleContext(Tff_formula_tuple_listContext.class,0);
		}
		public Tff_formula_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_formula_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_formula_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_formula_tuple(this);
		}
	}

	public final Tff_formula_tupleContext tff_formula_tuple() throws RecognitionException {
		Tff_formula_tupleContext _localctx = new Tff_formula_tupleContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tff_formula_tuple);
		try {
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				match(T__16);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(T__11);
				setState(951);
				tff_formula_tuple_list();
				setState(952);
				match(T__12);
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

	public static class Tff_formula_tuple_listContext extends ParserRuleContext {
		public List<Tff_logic_formulaContext> tff_logic_formula() {
			return getRuleContexts(Tff_logic_formulaContext.class);
		}
		public Tff_logic_formulaContext tff_logic_formula(int i) {
			return getRuleContext(Tff_logic_formulaContext.class,i);
		}
		public Tff_formula_tuple_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_formula_tuple_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_formula_tuple_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_formula_tuple_list(this);
		}
	}

	public final Tff_formula_tuple_listContext tff_formula_tuple_list() throws RecognitionException {
		Tff_formula_tuple_listContext _localctx = new Tff_formula_tuple_listContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tff_formula_tuple_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			tff_logic_formula();
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(957);
				match(T__1);
				setState(958);
				tff_logic_formula();
				}
				}
				setState(963);
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

	public static class Tff_typed_atomContext extends ParserRuleContext {
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
		}
		public Tff_top_level_typeContext tff_top_level_type() {
			return getRuleContext(Tff_top_level_typeContext.class,0);
		}
		public Tff_typed_atomContext tff_typed_atom() {
			return getRuleContext(Tff_typed_atomContext.class,0);
		}
		public Tff_typed_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_typed_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_typed_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_typed_atom(this);
		}
	}

	public final Tff_typed_atomContext tff_typed_atom() throws RecognitionException {
		Tff_typed_atomContext _localctx = new Tff_typed_atomContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_tff_typed_atom);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_dollar_word:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				untyped_atom();
				setState(965);
				match(T__13);
				setState(966);
				tff_top_level_type();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				match(T__9);
				setState(969);
				tff_typed_atom();
				setState(970);
				match(T__10);
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

	public static class Tff_subtypeContext extends ParserRuleContext {
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
		}
		public TerminalNode Subtype_sign() { return getToken(tptp_v7_0_0_0Parser.Subtype_sign, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Tff_subtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_subtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_subtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_subtype(this);
		}
	}

	public final Tff_subtypeContext tff_subtype() throws RecognitionException {
		Tff_subtypeContext _localctx = new Tff_subtypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tff_subtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			untyped_atom();
			setState(975);
			match(Subtype_sign);
			setState(976);
			atom();
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

	public static class Tff_top_level_typeContext extends ParserRuleContext {
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_mapping_typeContext tff_mapping_type() {
			return getRuleContext(Tff_mapping_typeContext.class,0);
		}
		public Tf1_quantified_typeContext tf1_quantified_type() {
			return getRuleContext(Tf1_quantified_typeContext.class,0);
		}
		public Tff_top_level_typeContext tff_top_level_type() {
			return getRuleContext(Tff_top_level_typeContext.class,0);
		}
		public Tff_top_level_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_top_level_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_top_level_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_top_level_type(this);
		}
	}

	public final Tff_top_level_typeContext tff_top_level_type() throws RecognitionException {
		Tff_top_level_typeContext _localctx = new Tff_top_level_typeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tff_top_level_type);
		try {
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				tff_mapping_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				tf1_quantified_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(981);
				match(T__9);
				setState(982);
				tff_top_level_type();
				setState(983);
				match(T__10);
				}
				break;
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

	public static class Tf1_quantified_typeContext extends ParserRuleContext {
		public TerminalNode TyForall() { return getToken(tptp_v7_0_0_0Parser.TyForall, 0); }
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tff_monotypeContext tff_monotype() {
			return getRuleContext(Tff_monotypeContext.class,0);
		}
		public Tf1_quantified_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tf1_quantified_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTf1_quantified_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTf1_quantified_type(this);
		}
	}

	public final Tf1_quantified_typeContext tf1_quantified_type() throws RecognitionException {
		Tf1_quantified_typeContext _localctx = new Tf1_quantified_typeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_tf1_quantified_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(TyForall);
			setState(988);
			match(T__11);
			setState(989);
			tff_variable_list();
			setState(990);
			match(T__12);
			setState(991);
			match(T__13);
			setState(992);
			tff_monotype();
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

	public static class Tff_monotypeContext extends ParserRuleContext {
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_mapping_typeContext tff_mapping_type() {
			return getRuleContext(Tff_mapping_typeContext.class,0);
		}
		public Tff_monotypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_monotype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_monotype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_monotype(this);
		}
	}

	public final Tff_monotypeContext tff_monotype() throws RecognitionException {
		Tff_monotypeContext _localctx = new Tff_monotypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tff_monotype);
		try {
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_word:
			case Upper_word:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				tff_atomic_type();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(T__9);
				setState(996);
				tff_mapping_type();
				setState(997);
				match(T__10);
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

	public static class Tff_unitary_typeContext extends ParserRuleContext {
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_xprod_typeContext tff_xprod_type() {
			return getRuleContext(Tff_xprod_typeContext.class,0);
		}
		public Tff_unitary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unitary_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_unitary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_unitary_type(this);
		}
	}

	public final Tff_unitary_typeContext tff_unitary_type() throws RecognitionException {
		Tff_unitary_typeContext _localctx = new Tff_unitary_typeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tff_unitary_type);
		try {
			setState(1006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_word:
			case Upper_word:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				tff_atomic_type();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(T__9);
				setState(1003);
				tff_xprod_type(0);
				setState(1004);
				match(T__10);
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

	public static class Tff_atomic_typeContext extends ParserRuleContext {
		public Type_constantContext type_constant() {
			return getRuleContext(Type_constantContext.class,0);
		}
		public Defined_typeContext defined_type() {
			return getRuleContext(Defined_typeContext.class,0);
		}
		public Type_functorContext type_functor() {
			return getRuleContext(Type_functorContext.class,0);
		}
		public Tff_type_argumentsContext tff_type_arguments() {
			return getRuleContext(Tff_type_argumentsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Tff_atomic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_atomic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_atomic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_atomic_type(this);
		}
	}

	public final Tff_atomic_typeContext tff_atomic_type() throws RecognitionException {
		Tff_atomic_typeContext _localctx = new Tff_atomic_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tff_atomic_type);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				type_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				defined_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				type_functor();
				setState(1011);
				match(T__9);
				setState(1012);
				tff_type_arguments();
				setState(1013);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1015);
				variable();
				}
				break;
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

	public static class Tff_type_argumentsContext extends ParserRuleContext {
		public List<Tff_atomic_typeContext> tff_atomic_type() {
			return getRuleContexts(Tff_atomic_typeContext.class);
		}
		public Tff_atomic_typeContext tff_atomic_type(int i) {
			return getRuleContext(Tff_atomic_typeContext.class,i);
		}
		public Tff_type_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_type_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_type_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_type_arguments(this);
		}
	}

	public final Tff_type_argumentsContext tff_type_arguments() throws RecognitionException {
		Tff_type_argumentsContext _localctx = new Tff_type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tff_type_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			tff_atomic_type();
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1019);
				match(T__1);
				setState(1020);
				tff_atomic_type();
				}
				}
				setState(1025);
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

	public static class Tff_mapping_typeContext extends ParserRuleContext {
		public Tff_unitary_typeContext tff_unitary_type() {
			return getRuleContext(Tff_unitary_typeContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(tptp_v7_0_0_0Parser.Arrow, 0); }
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_mapping_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_mapping_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_mapping_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_mapping_type(this);
		}
	}

	public final Tff_mapping_typeContext tff_mapping_type() throws RecognitionException {
		Tff_mapping_typeContext _localctx = new Tff_mapping_typeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tff_mapping_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			tff_unitary_type();
			setState(1027);
			match(Arrow);
			setState(1028);
			tff_atomic_type();
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

	public static class Tff_xprod_typeContext extends ParserRuleContext {
		public Tff_unitary_typeContext tff_unitary_type() {
			return getRuleContext(Tff_unitary_typeContext.class,0);
		}
		public TerminalNode Star() { return getToken(tptp_v7_0_0_0Parser.Star, 0); }
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_xprod_typeContext tff_xprod_type() {
			return getRuleContext(Tff_xprod_typeContext.class,0);
		}
		public Tff_xprod_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_xprod_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_xprod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_xprod_type(this);
		}
	}

	public final Tff_xprod_typeContext tff_xprod_type() throws RecognitionException {
		return tff_xprod_type(0);
	}

	private Tff_xprod_typeContext tff_xprod_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_xprod_typeContext _localctx = new Tff_xprod_typeContext(_ctx, _parentState);
		Tff_xprod_typeContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_tff_xprod_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1031);
			tff_unitary_type();
			setState(1032);
			match(Star);
			setState(1033);
			tff_atomic_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(1040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_xprod_typeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_xprod_type);
					setState(1035);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1036);
					match(Star);
					setState(1037);
					tff_atomic_type();
					}
					} 
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tcf_formulaContext extends ParserRuleContext {
		public Tcf_logic_formulaContext tcf_logic_formula() {
			return getRuleContext(Tcf_logic_formulaContext.class,0);
		}
		public Tff_typed_atomContext tff_typed_atom() {
			return getRuleContext(Tff_typed_atomContext.class,0);
		}
		public Tcf_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTcf_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTcf_formula(this);
		}
	}

	public final Tcf_formulaContext tcf_formula() throws RecognitionException {
		Tcf_formulaContext _localctx = new Tcf_formulaContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_tcf_formula);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				tcf_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				tff_typed_atom();
				}
				break;
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

	public static class Tcf_logic_formulaContext extends ParserRuleContext {
		public Tcf_quantified_formulaContext tcf_quantified_formula() {
			return getRuleContext(Tcf_quantified_formulaContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public Tcf_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_logic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTcf_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTcf_logic_formula(this);
		}
	}

	public final Tcf_logic_formulaContext tcf_logic_formula() throws RecognitionException {
		Tcf_logic_formulaContext _localctx = new Tcf_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_tcf_logic_formula);
		try {
			setState(1049);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Forall:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				tcf_quantified_formula();
				}
				break;
			case T__9:
			case T__17:
			case T__18:
			case T__23:
			case T__24:
			case T__25:
			case Not:
			case Real:
			case Rational:
			case Integer:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Single_quoted:
			case Distinct_object:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				cnf_formula();
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

	public static class Tcf_quantified_formulaContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(tptp_v7_0_0_0Parser.Forall, 0); }
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public Tcf_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_quantified_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTcf_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTcf_quantified_formula(this);
		}
	}

	public final Tcf_quantified_formulaContext tcf_quantified_formula() throws RecognitionException {
		Tcf_quantified_formulaContext _localctx = new Tcf_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tcf_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(Forall);
			setState(1052);
			match(T__11);
			setState(1053);
			tff_variable_list();
			setState(1054);
			match(T__12);
			setState(1055);
			match(T__13);
			setState(1056);
			cnf_formula();
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

	public static class Fof_formulaContext extends ParserRuleContext {
		public Fof_logic_formulaContext fof_logic_formula() {
			return getRuleContext(Fof_logic_formulaContext.class,0);
		}
		public Fof_sequentContext fof_sequent() {
			return getRuleContext(Fof_sequentContext.class,0);
		}
		public Fof_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_formula(this);
		}
	}

	public final Fof_formulaContext fof_formula() throws RecognitionException {
		Fof_formulaContext _localctx = new Fof_formulaContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_fof_formula);
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				fof_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059);
				fof_sequent();
				}
				break;
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

	public static class Fof_logic_formulaContext extends ParserRuleContext {
		public Fof_binary_formulaContext fof_binary_formula() {
			return getRuleContext(Fof_binary_formulaContext.class,0);
		}
		public Fof_unitary_formulaContext fof_unitary_formula() {
			return getRuleContext(Fof_unitary_formulaContext.class,0);
		}
		public Fof_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_logic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_logic_formula(this);
		}
	}

	public final Fof_logic_formulaContext fof_logic_formula() throws RecognitionException {
		Fof_logic_formulaContext _localctx = new Fof_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_fof_logic_formula);
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				fof_binary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				fof_unitary_formula();
				}
				break;
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

	public static class Fof_binary_formulaContext extends ParserRuleContext {
		public Fof_binary_nonassocContext fof_binary_nonassoc() {
			return getRuleContext(Fof_binary_nonassocContext.class,0);
		}
		public Fof_binary_assocContext fof_binary_assoc() {
			return getRuleContext(Fof_binary_assocContext.class,0);
		}
		public Fof_binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_binary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_binary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_binary_formula(this);
		}
	}

	public final Fof_binary_formulaContext fof_binary_formula() throws RecognitionException {
		Fof_binary_formulaContext _localctx = new Fof_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_fof_binary_formula);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				fof_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				fof_binary_assoc();
				}
				break;
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

	public static class Fof_binary_nonassocContext extends ParserRuleContext {
		public List<Fof_unitary_formulaContext> fof_unitary_formula() {
			return getRuleContexts(Fof_unitary_formulaContext.class);
		}
		public Fof_unitary_formulaContext fof_unitary_formula(int i) {
			return getRuleContext(Fof_unitary_formulaContext.class,i);
		}
		public Binary_connectiveContext binary_connective() {
			return getRuleContext(Binary_connectiveContext.class,0);
		}
		public Fof_binary_nonassocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_binary_nonassoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_binary_nonassoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_binary_nonassoc(this);
		}
	}

	public final Fof_binary_nonassocContext fof_binary_nonassoc() throws RecognitionException {
		Fof_binary_nonassocContext _localctx = new Fof_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_fof_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			fof_unitary_formula();
			setState(1071);
			binary_connective();
			setState(1072);
			fof_unitary_formula();
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

	public static class Fof_binary_assocContext extends ParserRuleContext {
		public Fof_or_formulaContext fof_or_formula() {
			return getRuleContext(Fof_or_formulaContext.class,0);
		}
		public Fof_and_formulaContext fof_and_formula() {
			return getRuleContext(Fof_and_formulaContext.class,0);
		}
		public Fof_binary_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_binary_assoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_binary_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_binary_assoc(this);
		}
	}

	public final Fof_binary_assocContext fof_binary_assoc() throws RecognitionException {
		Fof_binary_assocContext _localctx = new Fof_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_fof_binary_assoc);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				fof_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
				fof_and_formula(0);
				}
				break;
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

	public static class Fof_or_formulaContext extends ParserRuleContext {
		public List<Fof_unitary_formulaContext> fof_unitary_formula() {
			return getRuleContexts(Fof_unitary_formulaContext.class);
		}
		public Fof_unitary_formulaContext fof_unitary_formula(int i) {
			return getRuleContext(Fof_unitary_formulaContext.class,i);
		}
		public TerminalNode Or() { return getToken(tptp_v7_0_0_0Parser.Or, 0); }
		public Fof_or_formulaContext fof_or_formula() {
			return getRuleContext(Fof_or_formulaContext.class,0);
		}
		public Fof_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_or_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_or_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_or_formula(this);
		}
	}

	public final Fof_or_formulaContext fof_or_formula() throws RecognitionException {
		return fof_or_formula(0);
	}

	private Fof_or_formulaContext fof_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Fof_or_formulaContext _localctx = new Fof_or_formulaContext(_ctx, _parentState);
		Fof_or_formulaContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_fof_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1079);
			fof_unitary_formula();
			setState(1080);
			match(Or);
			setState(1081);
			fof_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(1088);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Fof_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fof_or_formula);
					setState(1083);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1084);
					match(Or);
					setState(1085);
					fof_unitary_formula();
					}
					} 
				}
				setState(1090);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Fof_and_formulaContext extends ParserRuleContext {
		public List<Fof_unitary_formulaContext> fof_unitary_formula() {
			return getRuleContexts(Fof_unitary_formulaContext.class);
		}
		public Fof_unitary_formulaContext fof_unitary_formula(int i) {
			return getRuleContext(Fof_unitary_formulaContext.class,i);
		}
		public TerminalNode And() { return getToken(tptp_v7_0_0_0Parser.And, 0); }
		public Fof_and_formulaContext fof_and_formula() {
			return getRuleContext(Fof_and_formulaContext.class,0);
		}
		public Fof_and_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_and_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_and_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_and_formula(this);
		}
	}

	public final Fof_and_formulaContext fof_and_formula() throws RecognitionException {
		return fof_and_formula(0);
	}

	private Fof_and_formulaContext fof_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Fof_and_formulaContext _localctx = new Fof_and_formulaContext(_ctx, _parentState);
		Fof_and_formulaContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_fof_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1092);
			fof_unitary_formula();
			setState(1093);
			match(And);
			setState(1094);
			fof_unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(1101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Fof_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fof_and_formula);
					setState(1096);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1097);
					match(And);
					setState(1098);
					fof_unitary_formula();
					}
					} 
				}
				setState(1103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Fof_unitary_formulaContext extends ParserRuleContext {
		public Fof_quantified_formulaContext fof_quantified_formula() {
			return getRuleContext(Fof_quantified_formulaContext.class,0);
		}
		public Fof_unary_formulaContext fof_unary_formula() {
			return getRuleContext(Fof_unary_formulaContext.class,0);
		}
		public Fof_atomic_formulaContext fof_atomic_formula() {
			return getRuleContext(Fof_atomic_formulaContext.class,0);
		}
		public Fof_logic_formulaContext fof_logic_formula() {
			return getRuleContext(Fof_logic_formulaContext.class,0);
		}
		public Fof_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_unitary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_unitary_formula(this);
		}
	}

	public final Fof_unitary_formulaContext fof_unitary_formula() throws RecognitionException {
		Fof_unitary_formulaContext _localctx = new Fof_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_fof_unitary_formula);
		try {
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1104);
				fof_quantified_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				fof_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1106);
				fof_atomic_formula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1107);
				match(T__9);
				setState(1108);
				fof_logic_formula();
				setState(1109);
				match(T__10);
				}
				break;
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

	public static class Fof_quantified_formulaContext extends ParserRuleContext {
		public Fof_quantifierContext fof_quantifier() {
			return getRuleContext(Fof_quantifierContext.class,0);
		}
		public Fof_variable_listContext fof_variable_list() {
			return getRuleContext(Fof_variable_listContext.class,0);
		}
		public Fof_unitary_formulaContext fof_unitary_formula() {
			return getRuleContext(Fof_unitary_formulaContext.class,0);
		}
		public Fof_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_quantified_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_quantified_formula(this);
		}
	}

	public final Fof_quantified_formulaContext fof_quantified_formula() throws RecognitionException {
		Fof_quantified_formulaContext _localctx = new Fof_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_fof_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			fof_quantifier();
			setState(1114);
			match(T__11);
			setState(1115);
			fof_variable_list();
			setState(1116);
			match(T__12);
			setState(1117);
			match(T__13);
			setState(1118);
			fof_unitary_formula();
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

	public static class Fof_variable_listContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Fof_variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_variable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_variable_list(this);
		}
	}

	public final Fof_variable_listContext fof_variable_list() throws RecognitionException {
		Fof_variable_listContext _localctx = new Fof_variable_listContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_fof_variable_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			variable();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1121);
				match(T__1);
				setState(1122);
				variable();
				}
				}
				setState(1127);
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

	public static class Fof_unary_formulaContext extends ParserRuleContext {
		public Unary_connectiveContext unary_connective() {
			return getRuleContext(Unary_connectiveContext.class,0);
		}
		public Fof_unitary_formulaContext fof_unitary_formula() {
			return getRuleContext(Fof_unitary_formulaContext.class,0);
		}
		public Fof_infix_unaryContext fof_infix_unary() {
			return getRuleContext(Fof_infix_unaryContext.class,0);
		}
		public Fof_unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_unary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_unary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_unary_formula(this);
		}
	}

	public final Fof_unary_formulaContext fof_unary_formula() throws RecognitionException {
		Fof_unary_formulaContext _localctx = new Fof_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_fof_unary_formula);
		try {
			setState(1132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				unary_connective();
				setState(1129);
				fof_unitary_formula();
				}
				break;
			case T__17:
			case T__18:
			case T__23:
			case T__24:
			case T__25:
			case Real:
			case Rational:
			case Integer:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Single_quoted:
			case Distinct_object:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				fof_infix_unary();
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

	public static class Fof_infix_unaryContext extends ParserRuleContext {
		public List<Fof_termContext> fof_term() {
			return getRuleContexts(Fof_termContext.class);
		}
		public Fof_termContext fof_term(int i) {
			return getRuleContext(Fof_termContext.class,i);
		}
		public TerminalNode Infix_inequality() { return getToken(tptp_v7_0_0_0Parser.Infix_inequality, 0); }
		public Fof_infix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_infix_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_infix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_infix_unary(this);
		}
	}

	public final Fof_infix_unaryContext fof_infix_unary() throws RecognitionException {
		Fof_infix_unaryContext _localctx = new Fof_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_fof_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			fof_term();
			setState(1135);
			match(Infix_inequality);
			setState(1136);
			fof_term();
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

	public static class Fof_atomic_formulaContext extends ParserRuleContext {
		public Fof_plain_atomic_formulaContext fof_plain_atomic_formula() {
			return getRuleContext(Fof_plain_atomic_formulaContext.class,0);
		}
		public Fof_defined_atomic_formulaContext fof_defined_atomic_formula() {
			return getRuleContext(Fof_defined_atomic_formulaContext.class,0);
		}
		public Fof_system_atomic_formulaContext fof_system_atomic_formula() {
			return getRuleContext(Fof_system_atomic_formulaContext.class,0);
		}
		public Fof_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_atomic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_atomic_formula(this);
		}
	}

	public final Fof_atomic_formulaContext fof_atomic_formula() throws RecognitionException {
		Fof_atomic_formulaContext _localctx = new Fof_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_fof_atomic_formula);
		try {
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138);
				fof_plain_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				fof_defined_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1140);
				fof_system_atomic_formula();
				}
				break;
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

	public static class Fof_plain_atomic_formulaContext extends ParserRuleContext {
		public Fof_plain_termContext fof_plain_term() {
			return getRuleContext(Fof_plain_termContext.class,0);
		}
		public Fof_plain_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_plain_atomic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_plain_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_plain_atomic_formula(this);
		}
	}

	public final Fof_plain_atomic_formulaContext fof_plain_atomic_formula() throws RecognitionException {
		Fof_plain_atomic_formulaContext _localctx = new Fof_plain_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_fof_plain_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			fof_plain_term();
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

	public static class Fof_defined_atomic_formulaContext extends ParserRuleContext {
		public Fof_defined_plain_formulaContext fof_defined_plain_formula() {
			return getRuleContext(Fof_defined_plain_formulaContext.class,0);
		}
		public Fof_defined_infix_formulaContext fof_defined_infix_formula() {
			return getRuleContext(Fof_defined_infix_formulaContext.class,0);
		}
		public Fof_defined_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_atomic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_defined_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_defined_atomic_formula(this);
		}
	}

	public final Fof_defined_atomic_formulaContext fof_defined_atomic_formula() throws RecognitionException {
		Fof_defined_atomic_formulaContext _localctx = new Fof_defined_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_fof_defined_atomic_formula);
		try {
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1145);
				fof_defined_plain_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146);
				fof_defined_infix_formula();
				}
				break;
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

	public static class Fof_defined_plain_formulaContext extends ParserRuleContext {
		public Fof_defined_termContext fof_defined_term() {
			return getRuleContext(Fof_defined_termContext.class,0);
		}
		public Fof_defined_plain_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_plain_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_defined_plain_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_defined_plain_formula(this);
		}
	}

	public final Fof_defined_plain_formulaContext fof_defined_plain_formula() throws RecognitionException {
		Fof_defined_plain_formulaContext _localctx = new Fof_defined_plain_formulaContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_fof_defined_plain_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			fof_defined_term();
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

	public static class Fof_defined_infix_formulaContext extends ParserRuleContext {
		public List<Fof_termContext> fof_term() {
			return getRuleContexts(Fof_termContext.class);
		}
		public Fof_termContext fof_term(int i) {
			return getRuleContext(Fof_termContext.class,i);
		}
		public Defined_infix_predContext defined_infix_pred() {
			return getRuleContext(Defined_infix_predContext.class,0);
		}
		public Fof_defined_infix_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_infix_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_defined_infix_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_defined_infix_formula(this);
		}
	}

	public final Fof_defined_infix_formulaContext fof_defined_infix_formula() throws RecognitionException {
		Fof_defined_infix_formulaContext _localctx = new Fof_defined_infix_formulaContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_fof_defined_infix_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			fof_term();
			setState(1152);
			defined_infix_pred();
			setState(1153);
			fof_term();
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

	public static class Fof_system_atomic_formulaContext extends ParserRuleContext {
		public Fof_system_termContext fof_system_term() {
			return getRuleContext(Fof_system_termContext.class,0);
		}
		public Fof_system_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_system_atomic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_system_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_system_atomic_formula(this);
		}
	}

	public final Fof_system_atomic_formulaContext fof_system_atomic_formula() throws RecognitionException {
		Fof_system_atomic_formulaContext _localctx = new Fof_system_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_fof_system_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			fof_system_term();
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

	public static class Fof_plain_termContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Fof_plain_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_plain_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_plain_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_plain_term(this);
		}
	}

	public final Fof_plain_termContext fof_plain_term() throws RecognitionException {
		Fof_plain_termContext _localctx = new Fof_plain_termContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_fof_plain_term);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1157);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				functor();
				setState(1159);
				match(T__9);
				setState(1160);
				fof_arguments();
				setState(1161);
				match(T__10);
				}
				break;
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

	public static class Fof_defined_termContext extends ParserRuleContext {
		public Defined_termContext defined_term() {
			return getRuleContext(Defined_termContext.class,0);
		}
		public Fof_defined_atomic_termContext fof_defined_atomic_term() {
			return getRuleContext(Fof_defined_atomic_termContext.class,0);
		}
		public Fof_defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_defined_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_defined_term(this);
		}
	}

	public final Fof_defined_termContext fof_defined_term() throws RecognitionException {
		Fof_defined_termContext _localctx = new Fof_defined_termContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_fof_defined_term);
		try {
			setState(1167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
			case Rational:
			case Integer:
			case Distinct_object:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				defined_term();
				}
				break;
			case Dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				fof_defined_atomic_term();
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

	public static class Fof_defined_atomic_termContext extends ParserRuleContext {
		public Fof_defined_plain_termContext fof_defined_plain_term() {
			return getRuleContext(Fof_defined_plain_termContext.class,0);
		}
		public Fof_defined_atomic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_atomic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_defined_atomic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_defined_atomic_term(this);
		}
	}

	public final Fof_defined_atomic_termContext fof_defined_atomic_term() throws RecognitionException {
		Fof_defined_atomic_termContext _localctx = new Fof_defined_atomic_termContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_fof_defined_atomic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			fof_defined_plain_term();
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

	public static class Fof_defined_plain_termContext extends ParserRuleContext {
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Fof_defined_plain_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_plain_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_defined_plain_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_defined_plain_term(this);
		}
	}

	public final Fof_defined_plain_termContext fof_defined_plain_term() throws RecognitionException {
		Fof_defined_plain_termContext _localctx = new Fof_defined_plain_termContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_fof_defined_plain_term);
		try {
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				defined_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				defined_functor();
				setState(1173);
				match(T__9);
				setState(1174);
				fof_arguments();
				setState(1175);
				match(T__10);
				}
				break;
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

	public static class Fof_system_termContext extends ParserRuleContext {
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Fof_system_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_system_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_system_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_system_term(this);
		}
	}

	public final Fof_system_termContext fof_system_term() throws RecognitionException {
		Fof_system_termContext _localctx = new Fof_system_termContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_fof_system_term);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				system_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				system_functor();
				setState(1181);
				match(T__9);
				setState(1182);
				fof_arguments();
				setState(1183);
				match(T__10);
				}
				break;
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

	public static class Fof_argumentsContext extends ParserRuleContext {
		public List<Fof_termContext> fof_term() {
			return getRuleContexts(Fof_termContext.class);
		}
		public Fof_termContext fof_term(int i) {
			return getRuleContext(Fof_termContext.class,i);
		}
		public Fof_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_arguments(this);
		}
	}

	public final Fof_argumentsContext fof_arguments() throws RecognitionException {
		Fof_argumentsContext _localctx = new Fof_argumentsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_fof_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			fof_term();
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1188);
				match(T__1);
				setState(1189);
				fof_term();
				}
				}
				setState(1194);
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

	public static class Fof_termContext extends ParserRuleContext {
		public Fof_function_termContext fof_function_term() {
			return getRuleContext(Fof_function_termContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Tff_conditional_termContext tff_conditional_term() {
			return getRuleContext(Tff_conditional_termContext.class,0);
		}
		public Tff_let_termContext tff_let_term() {
			return getRuleContext(Tff_let_termContext.class,0);
		}
		public Tff_tuple_termContext tff_tuple_term() {
			return getRuleContext(Tff_tuple_termContext.class,0);
		}
		public Fof_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_term(this);
		}
	}

	public final Fof_termContext fof_term() throws RecognitionException {
		Fof_termContext _localctx = new Fof_termContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_fof_term);
		try {
			setState(1200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
			case Rational:
			case Integer:
			case Dollar_word:
			case Dollar_dollar_word:
			case Lower_word:
			case Single_quoted:
			case Distinct_object:
				enterOuterAlt(_localctx, 1);
				{
				setState(1195);
				fof_function_term();
				}
				break;
			case Upper_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				variable();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				tff_conditional_term();
				}
				break;
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(1198);
				tff_let_term();
				}
				break;
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(1199);
				tff_tuple_term();
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

	public static class Fof_function_termContext extends ParserRuleContext {
		public Fof_plain_termContext fof_plain_term() {
			return getRuleContext(Fof_plain_termContext.class,0);
		}
		public Fof_defined_termContext fof_defined_term() {
			return getRuleContext(Fof_defined_termContext.class,0);
		}
		public Fof_system_termContext fof_system_term() {
			return getRuleContext(Fof_system_termContext.class,0);
		}
		public Fof_function_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_function_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_function_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_function_term(this);
		}
	}

	public final Fof_function_termContext fof_function_term() throws RecognitionException {
		Fof_function_termContext _localctx = new Fof_function_termContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fof_function_term);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				fof_plain_term();
				}
				break;
			case Real:
			case Rational:
			case Integer:
			case Dollar_word:
			case Distinct_object:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				fof_defined_term();
				}
				break;
			case Dollar_dollar_word:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				fof_system_term();
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

	public static class Tff_conditional_termContext extends ParserRuleContext {
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public List<Fof_termContext> fof_term() {
			return getRuleContexts(Fof_termContext.class);
		}
		public Fof_termContext fof_term(int i) {
			return getRuleContext(Fof_termContext.class,i);
		}
		public Tff_conditional_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_conditional_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_conditional_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_conditional_term(this);
		}
	}

	public final Tff_conditional_termContext tff_conditional_term() throws RecognitionException {
		Tff_conditional_termContext _localctx = new Tff_conditional_termContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_tff_conditional_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(T__23);
			setState(1208);
			tff_logic_formula();
			setState(1209);
			match(T__1);
			setState(1210);
			fof_term();
			setState(1211);
			match(T__1);
			setState(1212);
			fof_term();
			setState(1213);
			match(T__10);
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

	public static class Tff_let_termContext extends ParserRuleContext {
		public Tff_let_formula_defnsContext tff_let_formula_defns() {
			return getRuleContext(Tff_let_formula_defnsContext.class,0);
		}
		public Fof_termContext fof_term() {
			return getRuleContext(Fof_termContext.class,0);
		}
		public Tff_let_term_defnsContext tff_let_term_defns() {
			return getRuleContext(Tff_let_term_defnsContext.class,0);
		}
		public Tff_let_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_let_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_let_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_let_term(this);
		}
	}

	public final Tff_let_termContext tff_let_term() throws RecognitionException {
		Tff_let_termContext _localctx = new Tff_let_termContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_tff_let_term);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				match(T__24);
				setState(1216);
				tff_let_formula_defns();
				setState(1217);
				match(T__1);
				setState(1218);
				fof_term();
				setState(1219);
				match(T__10);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				match(T__25);
				setState(1222);
				tff_let_term_defns();
				setState(1223);
				match(T__1);
				setState(1224);
				fof_term();
				setState(1225);
				match(T__10);
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

	public static class Tff_tuple_termContext extends ParserRuleContext {
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Tff_tuple_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_tuple_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_tuple_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_tuple_term(this);
		}
	}

	public final Tff_tuple_termContext tff_tuple_term() throws RecognitionException {
		Tff_tuple_termContext _localctx = new Tff_tuple_termContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_tff_tuple_term);
		try {
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				match(T__18);
				setState(1231);
				fof_arguments();
				setState(1232);
				match(T__19);
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

	public static class Fof_sequentContext extends ParserRuleContext {
		public List<Fof_formula_tupleContext> fof_formula_tuple() {
			return getRuleContexts(Fof_formula_tupleContext.class);
		}
		public Fof_formula_tupleContext fof_formula_tuple(int i) {
			return getRuleContext(Fof_formula_tupleContext.class,i);
		}
		public TerminalNode Gentzen_arrow() { return getToken(tptp_v7_0_0_0Parser.Gentzen_arrow, 0); }
		public Fof_sequentContext fof_sequent() {
			return getRuleContext(Fof_sequentContext.class,0);
		}
		public Fof_sequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_sequent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_sequent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_sequent(this);
		}
	}

	public final Fof_sequentContext fof_sequent() throws RecognitionException {
		Fof_sequentContext _localctx = new Fof_sequentContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_fof_sequent);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				fof_formula_tuple();
				setState(1237);
				match(Gentzen_arrow);
				setState(1238);
				fof_formula_tuple();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				match(T__9);
				setState(1241);
				fof_sequent();
				setState(1242);
				match(T__10);
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

	public static class Fof_formula_tupleContext extends ParserRuleContext {
		public Fof_formula_tuple_listContext fof_formula_tuple_list() {
			return getRuleContext(Fof_formula_tuple_listContext.class,0);
		}
		public Fof_formula_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_formula_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_formula_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_formula_tuple(this);
		}
	}

	public final Fof_formula_tupleContext fof_formula_tuple() throws RecognitionException {
		Fof_formula_tupleContext _localctx = new Fof_formula_tupleContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_fof_formula_tuple);
		try {
			setState(1251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				match(T__16);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				match(T__11);
				setState(1248);
				fof_formula_tuple_list();
				setState(1249);
				match(T__12);
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

	public static class Fof_formula_tuple_listContext extends ParserRuleContext {
		public List<Fof_logic_formulaContext> fof_logic_formula() {
			return getRuleContexts(Fof_logic_formulaContext.class);
		}
		public Fof_logic_formulaContext fof_logic_formula(int i) {
			return getRuleContext(Fof_logic_formulaContext.class,i);
		}
		public Fof_formula_tuple_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_formula_tuple_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_formula_tuple_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_formula_tuple_list(this);
		}
	}

	public final Fof_formula_tuple_listContext fof_formula_tuple_list() throws RecognitionException {
		Fof_formula_tuple_listContext _localctx = new Fof_formula_tuple_listContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_fof_formula_tuple_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			fof_logic_formula();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1254);
				match(T__1);
				setState(1255);
				fof_logic_formula();
				}
				}
				setState(1260);
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

	public static class Cnf_formulaContext extends ParserRuleContext {
		public Cnf_disjunctionContext cnf_disjunction() {
			return getRuleContext(Cnf_disjunctionContext.class,0);
		}
		public Cnf_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterCnf_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitCnf_formula(this);
		}
	}

	public final Cnf_formulaContext cnf_formula() throws RecognitionException {
		Cnf_formulaContext _localctx = new Cnf_formulaContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_cnf_formula);
		try {
			setState(1266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__23:
			case T__24:
			case T__25:
			case Not:
			case Real:
			case Rational:
			case Integer:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Single_quoted:
			case Distinct_object:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				cnf_disjunction(0);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(T__9);
				setState(1263);
				cnf_disjunction(0);
				setState(1264);
				match(T__10);
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

	public static class Cnf_disjunctionContext extends ParserRuleContext {
		public Cnf_literalContext cnf_literal() {
			return getRuleContext(Cnf_literalContext.class,0);
		}
		public Cnf_disjunctionContext cnf_disjunction() {
			return getRuleContext(Cnf_disjunctionContext.class,0);
		}
		public TerminalNode Or() { return getToken(tptp_v7_0_0_0Parser.Or, 0); }
		public Cnf_disjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterCnf_disjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitCnf_disjunction(this);
		}
	}

	public final Cnf_disjunctionContext cnf_disjunction() throws RecognitionException {
		return cnf_disjunction(0);
	}

	private Cnf_disjunctionContext cnf_disjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cnf_disjunctionContext _localctx = new Cnf_disjunctionContext(_ctx, _parentState);
		Cnf_disjunctionContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_cnf_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1269);
			cnf_literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cnf_disjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cnf_disjunction);
					setState(1271);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1272);
					match(Or);
					setState(1273);
					cnf_literal();
					}
					} 
				}
				setState(1278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cnf_literalContext extends ParserRuleContext {
		public Fof_atomic_formulaContext fof_atomic_formula() {
			return getRuleContext(Fof_atomic_formulaContext.class,0);
		}
		public TerminalNode Not() { return getToken(tptp_v7_0_0_0Parser.Not, 0); }
		public Fof_infix_unaryContext fof_infix_unary() {
			return getRuleContext(Fof_infix_unaryContext.class,0);
		}
		public Cnf_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterCnf_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitCnf_literal(this);
		}
	}

	public final Cnf_literalContext cnf_literal() throws RecognitionException {
		Cnf_literalContext _localctx = new Cnf_literalContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cnf_literal);
		try {
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1279);
				fof_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				match(Not);
				setState(1281);
				fof_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1282);
				fof_infix_unary();
				}
				break;
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

	public static class Thf_quantifierContext extends ParserRuleContext {
		public Fof_quantifierContext fof_quantifier() {
			return getRuleContext(Fof_quantifierContext.class,0);
		}
		public Th0_quantifierContext th0_quantifier() {
			return getRuleContext(Th0_quantifierContext.class,0);
		}
		public Th1_quantifierContext th1_quantifier() {
			return getRuleContext(Th1_quantifierContext.class,0);
		}
		public Thf_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_quantifier(this);
		}
	}

	public final Thf_quantifierContext thf_quantifier() throws RecognitionException {
		Thf_quantifierContext _localctx = new Thf_quantifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_thf_quantifier);
		try {
			setState(1288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Forall:
			case Exists:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285);
				fof_quantifier();
				}
				break;
			case Lambda:
			case Choice:
			case Description:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				th0_quantifier();
				}
				break;
			case TyForall:
			case TyExists:
				enterOuterAlt(_localctx, 3);
				{
				setState(1287);
				th1_quantifier();
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

	public static class Th0_quantifierContext extends ParserRuleContext {
		public TerminalNode Lambda() { return getToken(tptp_v7_0_0_0Parser.Lambda, 0); }
		public TerminalNode Choice() { return getToken(tptp_v7_0_0_0Parser.Choice, 0); }
		public TerminalNode Description() { return getToken(tptp_v7_0_0_0Parser.Description, 0); }
		public Th0_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th0_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTh0_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTh0_quantifier(this);
		}
	}

	public final Th0_quantifierContext th0_quantifier() throws RecognitionException {
		Th0_quantifierContext _localctx = new Th0_quantifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_th0_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (Lambda - 61)) | (1L << (Choice - 61)) | (1L << (Description - 61)))) != 0)) ) {
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

	public static class Th1_quantifierContext extends ParserRuleContext {
		public TerminalNode TyForall() { return getToken(tptp_v7_0_0_0Parser.TyForall, 0); }
		public TerminalNode TyExists() { return getToken(tptp_v7_0_0_0Parser.TyExists, 0); }
		public Th1_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th1_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTh1_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTh1_quantifier(this);
		}
	}

	public final Th1_quantifierContext th1_quantifier() throws RecognitionException {
		Th1_quantifierContext _localctx = new Th1_quantifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_th1_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_la = _input.LA(1);
			if ( !(_la==TyForall || _la==TyExists) ) {
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

	public static class Thf_pair_connectiveContext extends ParserRuleContext {
		public TerminalNode Infix_equality() { return getToken(tptp_v7_0_0_0Parser.Infix_equality, 0); }
		public TerminalNode Infix_inequality() { return getToken(tptp_v7_0_0_0Parser.Infix_inequality, 0); }
		public Binary_connectiveContext binary_connective() {
			return getRuleContext(Binary_connectiveContext.class,0);
		}
		public TerminalNode Assignment() { return getToken(tptp_v7_0_0_0Parser.Assignment, 0); }
		public Thf_pair_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_pair_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_pair_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_pair_connective(this);
		}
	}

	public final Thf_pair_connectiveContext thf_pair_connective() throws RecognitionException {
		Thf_pair_connectiveContext _localctx = new Thf_pair_connectiveContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_thf_pair_connective);
		try {
			setState(1298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Infix_equality:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				match(Infix_equality);
				}
				break;
			case Infix_inequality:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				match(Infix_inequality);
				}
				break;
			case Iff:
			case Impl:
			case If:
			case Niff:
			case Nor:
			case Nand:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				binary_connective();
				}
				break;
			case Assignment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1297);
				match(Assignment);
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

	public static class Thf_unary_connectiveContext extends ParserRuleContext {
		public Unary_connectiveContext unary_connective() {
			return getRuleContext(Unary_connectiveContext.class,0);
		}
		public Th1_unary_connectiveContext th1_unary_connective() {
			return getRuleContext(Th1_unary_connectiveContext.class,0);
		}
		public Thf_unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unary_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterThf_unary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitThf_unary_connective(this);
		}
	}

	public final Thf_unary_connectiveContext thf_unary_connective() throws RecognitionException {
		Thf_unary_connectiveContext _localctx = new Thf_unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_thf_unary_connective);
		try {
			setState(1302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				unary_connective();
				}
				break;
			case ForallComb:
			case ExistsComb:
			case ChoiceComb:
			case DescriptionComb:
			case EqComb:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301);
				th1_unary_connective();
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

	public static class Th1_unary_connectiveContext extends ParserRuleContext {
		public TerminalNode ForallComb() { return getToken(tptp_v7_0_0_0Parser.ForallComb, 0); }
		public TerminalNode ExistsComb() { return getToken(tptp_v7_0_0_0Parser.ExistsComb, 0); }
		public TerminalNode ChoiceComb() { return getToken(tptp_v7_0_0_0Parser.ChoiceComb, 0); }
		public TerminalNode DescriptionComb() { return getToken(tptp_v7_0_0_0Parser.DescriptionComb, 0); }
		public TerminalNode EqComb() { return getToken(tptp_v7_0_0_0Parser.EqComb, 0); }
		public Th1_unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th1_unary_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTh1_unary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTh1_unary_connective(this);
		}
	}

	public final Th1_unary_connectiveContext th1_unary_connective() throws RecognitionException {
		Th1_unary_connectiveContext _localctx = new Th1_unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_th1_unary_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (ForallComb - 53)) | (1L << (ExistsComb - 53)) | (1L << (ChoiceComb - 53)) | (1L << (DescriptionComb - 53)) | (1L << (EqComb - 53)))) != 0)) ) {
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

	public static class Tff_pair_connectiveContext extends ParserRuleContext {
		public Binary_connectiveContext binary_connective() {
			return getRuleContext(Binary_connectiveContext.class,0);
		}
		public TerminalNode Assignment() { return getToken(tptp_v7_0_0_0Parser.Assignment, 0); }
		public Tff_pair_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_pair_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTff_pair_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTff_pair_connective(this);
		}
	}

	public final Tff_pair_connectiveContext tff_pair_connective() throws RecognitionException {
		Tff_pair_connectiveContext _localctx = new Tff_pair_connectiveContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_tff_pair_connective);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Iff:
			case Impl:
			case If:
			case Niff:
			case Nor:
			case Nand:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				binary_connective();
				}
				break;
			case Assignment:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(Assignment);
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

	public static class Fof_quantifierContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(tptp_v7_0_0_0Parser.Forall, 0); }
		public TerminalNode Exists() { return getToken(tptp_v7_0_0_0Parser.Exists, 0); }
		public Fof_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFof_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFof_quantifier(this);
		}
	}

	public final Fof_quantifierContext fof_quantifier() throws RecognitionException {
		Fof_quantifierContext _localctx = new Fof_quantifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_fof_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_la = _input.LA(1);
			if ( !(_la==Forall || _la==Exists) ) {
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

	public static class Binary_connectiveContext extends ParserRuleContext {
		public TerminalNode Iff() { return getToken(tptp_v7_0_0_0Parser.Iff, 0); }
		public TerminalNode Impl() { return getToken(tptp_v7_0_0_0Parser.Impl, 0); }
		public TerminalNode If() { return getToken(tptp_v7_0_0_0Parser.If, 0); }
		public TerminalNode Niff() { return getToken(tptp_v7_0_0_0Parser.Niff, 0); }
		public TerminalNode Nor() { return getToken(tptp_v7_0_0_0Parser.Nor, 0); }
		public TerminalNode Nand() { return getToken(tptp_v7_0_0_0Parser.Nand, 0); }
		public Binary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterBinary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitBinary_connective(this);
		}
	}

	public final Binary_connectiveContext binary_connective() throws RecognitionException {
		Binary_connectiveContext _localctx = new Binary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_binary_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Iff) | (1L << Impl) | (1L << If) | (1L << Niff) | (1L << Nor) | (1L << Nand))) != 0)) ) {
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

	public static class Assoc_connectiveContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(tptp_v7_0_0_0Parser.Or, 0); }
		public TerminalNode And() { return getToken(tptp_v7_0_0_0Parser.And, 0); }
		public Assoc_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAssoc_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAssoc_connective(this);
		}
	}

	public final Assoc_connectiveContext assoc_connective() throws RecognitionException {
		Assoc_connectiveContext _localctx = new Assoc_connectiveContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_assoc_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_la = _input.LA(1);
			if ( !(_la==Or || _la==And) ) {
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

	public static class Unary_connectiveContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(tptp_v7_0_0_0Parser.Not, 0); }
		public Unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterUnary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitUnary_connective(this);
		}
	}

	public final Unary_connectiveContext unary_connective() throws RecognitionException {
		Unary_connectiveContext _localctx = new Unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_unary_connective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(Not);
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

	public static class Type_constantContext extends ParserRuleContext {
		public Type_functorContext type_functor() {
			return getRuleContext(Type_functorContext.class,0);
		}
		public Type_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterType_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitType_constant(this);
		}
	}

	public final Type_constantContext type_constant() throws RecognitionException {
		Type_constantContext _localctx = new Type_constantContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_type_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			type_functor();
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

	public static class Type_functorContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Type_functorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_functor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterType_functor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitType_functor(this);
		}
	}

	public final Type_functorContext type_functor() throws RecognitionException {
		Type_functorContext _localctx = new Type_functorContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_type_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			atomic_word();
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

	public static class Defined_typeContext extends ParserRuleContext {
		public TerminalNode Dollar_word() { return getToken(tptp_v7_0_0_0Parser.Dollar_word, 0); }
		public Defined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDefined_type(this);
		}
	}

	public final Defined_typeContext defined_type() throws RecognitionException {
		Defined_typeContext _localctx = new Defined_typeContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_defined_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(Dollar_word);
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

	public static class System_typeContext extends ParserRuleContext {
		public Atomic_system_wordContext atomic_system_word() {
			return getRuleContext(Atomic_system_wordContext.class,0);
		}
		public System_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterSystem_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitSystem_type(this);
		}
	}

	public final System_typeContext system_type() throws RecognitionException {
		System_typeContext _localctx = new System_typeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_system_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			atomic_system_word();
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

	public static class AtomContext extends ParserRuleContext {
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
		}
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_atom);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_dollar_word:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				untyped_atom();
				}
				break;
			case Dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				defined_constant();
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

	public static class Untyped_atomContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public Untyped_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untyped_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterUntyped_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitUntyped_atom(this);
		}
	}

	public final Untyped_atomContext untyped_atom() throws RecognitionException {
		Untyped_atomContext _localctx = new Untyped_atomContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_untyped_atom);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				constant();
				}
				break;
			case Dollar_dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331);
				system_constant();
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

	public static class Defined_propositionContext extends ParserRuleContext {
		public TerminalNode Dollar_word() { return getToken(tptp_v7_0_0_0Parser.Dollar_word, 0); }
		public Defined_propositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_proposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDefined_proposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDefined_proposition(this);
		}
	}

	public final Defined_propositionContext defined_proposition() throws RecognitionException {
		Defined_propositionContext _localctx = new Defined_propositionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_defined_proposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(Dollar_word);
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

	public static class Defined_predicateContext extends ParserRuleContext {
		public TerminalNode Dollar_word() { return getToken(tptp_v7_0_0_0Parser.Dollar_word, 0); }
		public Defined_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDefined_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDefined_predicate(this);
		}
	}

	public final Defined_predicateContext defined_predicate() throws RecognitionException {
		Defined_predicateContext _localctx = new Defined_predicateContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_defined_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(Dollar_word);
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

	public static class Defined_infix_predContext extends ParserRuleContext {
		public TerminalNode Infix_equality() { return getToken(tptp_v7_0_0_0Parser.Infix_equality, 0); }
		public TerminalNode Assignment() { return getToken(tptp_v7_0_0_0Parser.Assignment, 0); }
		public Defined_infix_predContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_infix_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDefined_infix_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDefined_infix_pred(this);
		}
	}

	public final Defined_infix_predContext defined_infix_pred() throws RecognitionException {
		Defined_infix_predContext _localctx = new Defined_infix_predContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_defined_infix_pred);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			_la = _input.LA(1);
			if ( !(_la==Infix_equality || _la==Assignment) ) {
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

	public static class ConstantContext extends ParserRuleContext {
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			functor();
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

	public static class FunctorContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public FunctorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFunctor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFunctor(this);
		}
	}

	public final FunctorContext functor() throws RecognitionException {
		FunctorContext _localctx = new FunctorContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			atomic_word();
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

	public static class System_constantContext extends ParserRuleContext {
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public System_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterSystem_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitSystem_constant(this);
		}
	}

	public final System_constantContext system_constant() throws RecognitionException {
		System_constantContext _localctx = new System_constantContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_system_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			system_functor();
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

	public static class System_functorContext extends ParserRuleContext {
		public Atomic_system_wordContext atomic_system_word() {
			return getRuleContext(Atomic_system_wordContext.class,0);
		}
		public System_functorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_functor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterSystem_functor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitSystem_functor(this);
		}
	}

	public final System_functorContext system_functor() throws RecognitionException {
		System_functorContext _localctx = new System_functorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_system_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			atomic_system_word();
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

	public static class Defined_constantContext extends ParserRuleContext {
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public Defined_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDefined_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDefined_constant(this);
		}
	}

	public final Defined_constantContext defined_constant() throws RecognitionException {
		Defined_constantContext _localctx = new Defined_constantContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_defined_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			defined_functor();
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

	public static class Defined_functorContext extends ParserRuleContext {
		public Atomic_defined_wordContext atomic_defined_word() {
			return getRuleContext(Atomic_defined_wordContext.class,0);
		}
		public Defined_functorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_functor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDefined_functor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDefined_functor(this);
		}
	}

	public final Defined_functorContext defined_functor() throws RecognitionException {
		Defined_functorContext _localctx = new Defined_functorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_defined_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			atomic_defined_word();
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

	public static class Defined_termContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Distinct_object() { return getToken(tptp_v7_0_0_0Parser.Distinct_object, 0); }
		public Defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDefined_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDefined_term(this);
		}
	}

	public final Defined_termContext defined_term() throws RecognitionException {
		Defined_termContext _localctx = new Defined_termContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_defined_term);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				number();
				}
				break;
			case Distinct_object:
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				match(Distinct_object);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Upper_word() { return getToken(tptp_v7_0_0_0Parser.Upper_word, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(Upper_word);
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

	public static class SourceContext extends ParserRuleContext {
		public Dag_sourceContext dag_source() {
			return getRuleContext(Dag_sourceContext.class,0);
		}
		public Internal_sourceContext internal_source() {
			return getRuleContext(Internal_sourceContext.class,0);
		}
		public External_sourceContext external_source() {
			return getRuleContext(External_sourceContext.class,0);
		}
		public TerminalNode Lower_word() { return getToken(tptp_v7_0_0_0Parser.Lower_word, 0); }
		public SourcesContext sources() {
			return getRuleContext(SourcesContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_source);
		try {
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358);
				dag_source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				internal_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1360);
				external_source();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1361);
				match(Lower_word);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1362);
				match(T__11);
				setState(1363);
				sources();
				setState(1364);
				match(T__12);
				}
				break;
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

	public static class SourcesContext extends ParserRuleContext {
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public SourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitSources(this);
		}
	}

	public final SourcesContext sources() throws RecognitionException {
		SourcesContext _localctx = new SourcesContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_sources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			source();
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1369);
				match(T__1);
				setState(1370);
				source();
				}
				}
				setState(1375);
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

	public static class Dag_sourceContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Inference_recordContext inference_record() {
			return getRuleContext(Inference_recordContext.class,0);
		}
		public Dag_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dag_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDag_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDag_source(this);
		}
	}

	public final Dag_sourceContext dag_source() throws RecognitionException {
		Dag_sourceContext _localctx = new Dag_sourceContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_dag_source);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				name();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				inference_record();
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

	public static class Inference_recordContext extends ParserRuleContext {
		public Inference_ruleContext inference_rule() {
			return getRuleContext(Inference_ruleContext.class,0);
		}
		public Useful_infoContext useful_info() {
			return getRuleContext(Useful_infoContext.class,0);
		}
		public Inference_parentsContext inference_parents() {
			return getRuleContext(Inference_parentsContext.class,0);
		}
		public Inference_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInference_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInference_record(this);
		}
	}

	public final Inference_recordContext inference_record() throws RecognitionException {
		Inference_recordContext _localctx = new Inference_recordContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_inference_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(T__26);
			setState(1381);
			inference_rule();
			setState(1382);
			match(T__1);
			setState(1383);
			useful_info();
			setState(1384);
			match(T__1);
			setState(1385);
			inference_parents();
			setState(1386);
			match(T__10);
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

	public static class Inference_ruleContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Inference_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInference_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInference_rule(this);
		}
	}

	public final Inference_ruleContext inference_rule() throws RecognitionException {
		Inference_ruleContext _localctx = new Inference_ruleContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_inference_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			atomic_word();
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

	public static class Inference_parentsContext extends ParserRuleContext {
		public Parent_listContext parent_list() {
			return getRuleContext(Parent_listContext.class,0);
		}
		public Inference_parentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_parents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInference_parents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInference_parents(this);
		}
	}

	public final Inference_parentsContext inference_parents() throws RecognitionException {
		Inference_parentsContext _localctx = new Inference_parentsContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_inference_parents);
		try {
			setState(1395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				match(T__16);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				match(T__11);
				setState(1392);
				parent_list();
				setState(1393);
				match(T__12);
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

	public static class Parent_listContext extends ParserRuleContext {
		public List<Parent_infoContext> parent_info() {
			return getRuleContexts(Parent_infoContext.class);
		}
		public Parent_infoContext parent_info(int i) {
			return getRuleContext(Parent_infoContext.class,i);
		}
		public Parent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterParent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitParent_list(this);
		}
	}

	public final Parent_listContext parent_list() throws RecognitionException {
		Parent_listContext _localctx = new Parent_listContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_parent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			parent_info();
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1398);
				match(T__1);
				setState(1399);
				parent_info();
				}
				}
				setState(1404);
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

	public static class Parent_infoContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Parent_detailsContext parent_details() {
			return getRuleContext(Parent_detailsContext.class,0);
		}
		public Parent_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterParent_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitParent_info(this);
		}
	}

	public final Parent_infoContext parent_info() throws RecognitionException {
		Parent_infoContext _localctx = new Parent_infoContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_parent_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			source();
			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1406);
				parent_details();
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

	public static class Parent_detailsContext extends ParserRuleContext {
		public General_listContext general_list() {
			return getRuleContext(General_listContext.class,0);
		}
		public Parent_detailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_details; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterParent_details(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitParent_details(this);
		}
	}

	public final Parent_detailsContext parent_details() throws RecognitionException {
		Parent_detailsContext _localctx = new Parent_detailsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_parent_details);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(T__13);
			setState(1410);
			general_list();
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

	public static class Internal_sourceContext extends ParserRuleContext {
		public Intro_typeContext intro_type() {
			return getRuleContext(Intro_typeContext.class,0);
		}
		public Optional_infoContext optional_info() {
			return getRuleContext(Optional_infoContext.class,0);
		}
		public Internal_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internal_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInternal_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInternal_source(this);
		}
	}

	public final Internal_sourceContext internal_source() throws RecognitionException {
		Internal_sourceContext _localctx = new Internal_sourceContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_internal_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(T__27);
			setState(1413);
			intro_type();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1414);
				optional_info();
				}
			}

			setState(1417);
			match(T__10);
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

	public static class Intro_typeContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(tptp_v7_0_0_0Parser.Lower_word, 0); }
		public Intro_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterIntro_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitIntro_type(this);
		}
	}

	public final Intro_typeContext intro_type() throws RecognitionException {
		Intro_typeContext _localctx = new Intro_typeContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_intro_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(Lower_word);
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

	public static class External_sourceContext extends ParserRuleContext {
		public File_sourceContext file_source() {
			return getRuleContext(File_sourceContext.class,0);
		}
		public TheoryContext theory() {
			return getRuleContext(TheoryContext.class,0);
		}
		public Creator_sourceContext creator_source() {
			return getRuleContext(Creator_sourceContext.class,0);
		}
		public External_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterExternal_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitExternal_source(this);
		}
	}

	public final External_sourceContext external_source() throws RecognitionException {
		External_sourceContext _localctx = new External_sourceContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_external_source);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				file_source();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				theory();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(1423);
				creator_source();
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

	public static class File_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public File_infoContext file_info() {
			return getRuleContext(File_infoContext.class,0);
		}
		public File_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFile_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFile_source(this);
		}
	}

	public final File_sourceContext file_source() throws RecognitionException {
		File_sourceContext _localctx = new File_sourceContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_file_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(T__28);
			setState(1427);
			file_name();
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1428);
				file_info();
				}
			}

			setState(1431);
			match(T__10);
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

	public static class File_infoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public File_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFile_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFile_info(this);
		}
	}

	public final File_infoContext file_info() throws RecognitionException {
		File_infoContext _localctx = new File_infoContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_file_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(T__1);
			setState(1434);
			name();
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

	public static class TheoryContext extends ParserRuleContext {
		public Theory_nameContext theory_name() {
			return getRuleContext(Theory_nameContext.class,0);
		}
		public Optional_infoContext optional_info() {
			return getRuleContext(Optional_infoContext.class,0);
		}
		public TheoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTheory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTheory(this);
		}
	}

	public final TheoryContext theory() throws RecognitionException {
		TheoryContext _localctx = new TheoryContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_theory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(T__29);
			setState(1437);
			theory_name();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1438);
				optional_info();
				}
			}

			setState(1441);
			match(T__10);
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

	public static class Theory_nameContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(tptp_v7_0_0_0Parser.Lower_word, 0); }
		public Theory_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theory_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterTheory_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitTheory_name(this);
		}
	}

	public final Theory_nameContext theory_name() throws RecognitionException {
		Theory_nameContext _localctx = new Theory_nameContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_theory_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(Lower_word);
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

	public static class Creator_sourceContext extends ParserRuleContext {
		public Creator_nameContext creator_name() {
			return getRuleContext(Creator_nameContext.class,0);
		}
		public Optional_infoContext optional_info() {
			return getRuleContext(Optional_infoContext.class,0);
		}
		public Creator_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterCreator_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitCreator_source(this);
		}
	}

	public final Creator_sourceContext creator_source() throws RecognitionException {
		Creator_sourceContext _localctx = new Creator_sourceContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_creator_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(T__30);
			setState(1446);
			creator_name();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1447);
				optional_info();
				}
			}

			setState(1450);
			match(T__10);
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

	public static class Creator_nameContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Creator_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterCreator_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitCreator_name(this);
		}
	}

	public final Creator_nameContext creator_name() throws RecognitionException {
		Creator_nameContext _localctx = new Creator_nameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_creator_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			atomic_word();
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

	public static class Optional_infoContext extends ParserRuleContext {
		public Useful_infoContext useful_info() {
			return getRuleContext(Useful_infoContext.class,0);
		}
		public Optional_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterOptional_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitOptional_info(this);
		}
	}

	public final Optional_infoContext optional_info() throws RecognitionException {
		Optional_infoContext _localctx = new Optional_infoContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_optional_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(T__1);
			setState(1455);
			useful_info();
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

	public static class Useful_infoContext extends ParserRuleContext {
		public Info_itemsContext info_items() {
			return getRuleContext(Info_itemsContext.class,0);
		}
		public General_listContext general_list() {
			return getRuleContext(General_listContext.class,0);
		}
		public Useful_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useful_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterUseful_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitUseful_info(this);
		}
	}

	public final Useful_infoContext useful_info() throws RecognitionException {
		Useful_infoContext _localctx = new Useful_infoContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_useful_info);
		try {
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458);
				match(T__11);
				setState(1459);
				info_items();
				setState(1460);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1462);
				general_list();
				}
				break;
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

	public static class Info_itemsContext extends ParserRuleContext {
		public List<Info_itemContext> info_item() {
			return getRuleContexts(Info_itemContext.class);
		}
		public Info_itemContext info_item(int i) {
			return getRuleContext(Info_itemContext.class,i);
		}
		public Info_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInfo_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInfo_items(this);
		}
	}

	public final Info_itemsContext info_items() throws RecognitionException {
		Info_itemsContext _localctx = new Info_itemsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_info_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			info_item();
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1466);
				match(T__1);
				setState(1467);
				info_item();
				}
				}
				setState(1472);
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

	public static class Info_itemContext extends ParserRuleContext {
		public Formula_itemContext formula_item() {
			return getRuleContext(Formula_itemContext.class,0);
		}
		public Inference_itemContext inference_item() {
			return getRuleContext(Inference_itemContext.class,0);
		}
		public General_functionContext general_function() {
			return getRuleContext(General_functionContext.class,0);
		}
		public Info_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInfo_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInfo_item(this);
		}
	}

	public final Info_itemContext info_item() throws RecognitionException {
		Info_itemContext _localctx = new Info_itemContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_info_item);
		try {
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				formula_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				inference_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1475);
				general_function();
				}
				break;
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

	public static class Formula_itemContext extends ParserRuleContext {
		public Description_itemContext description_item() {
			return getRuleContext(Description_itemContext.class,0);
		}
		public Iquote_itemContext iquote_item() {
			return getRuleContext(Iquote_itemContext.class,0);
		}
		public Formula_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFormula_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFormula_item(this);
		}
	}

	public final Formula_itemContext formula_item() throws RecognitionException {
		Formula_itemContext _localctx = new Formula_itemContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_formula_item);
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				description_item();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				iquote_item();
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

	public static class Description_itemContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Description_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterDescription_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitDescription_item(this);
		}
	}

	public final Description_itemContext description_item() throws RecognitionException {
		Description_itemContext _localctx = new Description_itemContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_description_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			match(T__31);
			setState(1483);
			atomic_word();
			setState(1484);
			match(T__10);
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

	public static class Iquote_itemContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Iquote_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iquote_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterIquote_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitIquote_item(this);
		}
	}

	public final Iquote_itemContext iquote_item() throws RecognitionException {
		Iquote_itemContext _localctx = new Iquote_itemContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_iquote_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(T__32);
			setState(1487);
			atomic_word();
			setState(1488);
			match(T__10);
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

	public static class Inference_itemContext extends ParserRuleContext {
		public Inference_statusContext inference_status() {
			return getRuleContext(Inference_statusContext.class,0);
		}
		public Assumptions_recordContext assumptions_record() {
			return getRuleContext(Assumptions_recordContext.class,0);
		}
		public New_symbol_recordContext new_symbol_record() {
			return getRuleContext(New_symbol_recordContext.class,0);
		}
		public RefutationContext refutation() {
			return getRuleContext(RefutationContext.class,0);
		}
		public Inference_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInference_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInference_item(this);
		}
	}

	public final Inference_itemContext inference_item() throws RecognitionException {
		Inference_itemContext _localctx = new Inference_itemContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_inference_item);
		try {
			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				inference_status();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				assumptions_record();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(1492);
				new_symbol_record();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(1493);
				refutation();
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

	public static class Inference_statusContext extends ParserRuleContext {
		public Status_valueContext status_value() {
			return getRuleContext(Status_valueContext.class,0);
		}
		public Inference_infoContext inference_info() {
			return getRuleContext(Inference_infoContext.class,0);
		}
		public Inference_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInference_status(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInference_status(this);
		}
	}

	public final Inference_statusContext inference_status() throws RecognitionException {
		Inference_statusContext _localctx = new Inference_statusContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_inference_status);
		try {
			setState(1501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				match(T__33);
				setState(1497);
				status_value();
				setState(1498);
				match(T__10);
				}
				break;
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
				inference_info();
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

	public static class Status_valueContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(tptp_v7_0_0_0Parser.Lower_word, 0); }
		public Status_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterStatus_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitStatus_value(this);
		}
	}

	public final Status_valueContext status_value() throws RecognitionException {
		Status_valueContext _localctx = new Status_valueContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_status_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(Lower_word);
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

	public static class Inference_infoContext extends ParserRuleContext {
		public Inference_ruleContext inference_rule() {
			return getRuleContext(Inference_ruleContext.class,0);
		}
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public General_listContext general_list() {
			return getRuleContext(General_listContext.class,0);
		}
		public Inference_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInference_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInference_info(this);
		}
	}

	public final Inference_infoContext inference_info() throws RecognitionException {
		Inference_infoContext _localctx = new Inference_infoContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_inference_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			inference_rule();
			setState(1506);
			match(T__9);
			setState(1507);
			atomic_word();
			setState(1508);
			match(T__1);
			setState(1509);
			general_list();
			setState(1510);
			match(T__10);
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

	public static class Assumptions_recordContext extends ParserRuleContext {
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public Assumptions_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumptions_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAssumptions_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAssumptions_record(this);
		}
	}

	public final Assumptions_recordContext assumptions_record() throws RecognitionException {
		Assumptions_recordContext _localctx = new Assumptions_recordContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_assumptions_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			match(T__34);
			setState(1513);
			match(T__11);
			setState(1514);
			name_list();
			setState(1515);
			match(T__12);
			setState(1516);
			match(T__10);
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

	public static class RefutationContext extends ParserRuleContext {
		public File_sourceContext file_source() {
			return getRuleContext(File_sourceContext.class,0);
		}
		public RefutationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refutation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterRefutation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitRefutation(this);
		}
	}

	public final RefutationContext refutation() throws RecognitionException {
		RefutationContext _localctx = new RefutationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_refutation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			match(T__35);
			setState(1519);
			file_source();
			setState(1520);
			match(T__10);
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

	public static class New_symbol_recordContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public New_symbol_listContext new_symbol_list() {
			return getRuleContext(New_symbol_listContext.class,0);
		}
		public New_symbol_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_symbol_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterNew_symbol_record(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitNew_symbol_record(this);
		}
	}

	public final New_symbol_recordContext new_symbol_record() throws RecognitionException {
		New_symbol_recordContext _localctx = new New_symbol_recordContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_new_symbol_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(T__36);
			setState(1523);
			atomic_word();
			setState(1524);
			match(T__1);
			setState(1525);
			match(T__11);
			setState(1526);
			new_symbol_list();
			setState(1527);
			match(T__12);
			setState(1528);
			match(T__10);
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

	public static class New_symbol_listContext extends ParserRuleContext {
		public List<Principal_symbolContext> principal_symbol() {
			return getRuleContexts(Principal_symbolContext.class);
		}
		public Principal_symbolContext principal_symbol(int i) {
			return getRuleContext(Principal_symbolContext.class,i);
		}
		public New_symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterNew_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitNew_symbol_list(this);
		}
	}

	public final New_symbol_listContext new_symbol_list() throws RecognitionException {
		New_symbol_listContext _localctx = new New_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_new_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			principal_symbol();
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1531);
				match(T__1);
				setState(1532);
				principal_symbol();
				}
				}
				setState(1537);
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

	public static class Principal_symbolContext extends ParserRuleContext {
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Principal_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterPrincipal_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitPrincipal_symbol(this);
		}
	}

	public final Principal_symbolContext principal_symbol() throws RecognitionException {
		Principal_symbolContext _localctx = new Principal_symbolContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_principal_symbol);
		try {
			setState(1540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1538);
				functor();
				}
				break;
			case Upper_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1539);
				variable();
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

	public static class IncludeContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Formula_selectionContext formula_selection() {
			return getRuleContext(Formula_selectionContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_include);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			match(T__37);
			setState(1543);
			file_name();
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1544);
				formula_selection();
				}
			}

			setState(1547);
			match(T__2);
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

	public static class Formula_selectionContext extends ParserRuleContext {
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public Formula_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFormula_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFormula_selection(this);
		}
	}

	public final Formula_selectionContext formula_selection() throws RecognitionException {
		Formula_selectionContext _localctx = new Formula_selectionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_formula_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(T__1);
			setState(1550);
			match(T__11);
			setState(1551);
			name_list();
			setState(1552);
			match(T__12);
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

	public static class Name_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterName_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitName_list(this);
		}
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			name();
			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1555);
				match(T__1);
				setState(1556);
				name();
				}
				}
				setState(1561);
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

	public static class General_termContext extends ParserRuleContext {
		public General_dataContext general_data() {
			return getRuleContext(General_dataContext.class,0);
		}
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public General_listContext general_list() {
			return getRuleContext(General_listContext.class,0);
		}
		public General_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterGeneral_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitGeneral_term(this);
		}
	}

	public final General_termContext general_term() throws RecognitionException {
		General_termContext _localctx = new General_termContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_general_term);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				general_data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				general_data();
				setState(1564);
				match(T__13);
				setState(1565);
				general_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1567);
				general_list();
				}
				break;
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

	public static class General_dataContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public General_functionContext general_function() {
			return getRuleContext(General_functionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Distinct_object() { return getToken(tptp_v7_0_0_0Parser.Distinct_object, 0); }
		public Formula_dataContext formula_data() {
			return getRuleContext(Formula_dataContext.class,0);
		}
		public General_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterGeneral_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitGeneral_data(this);
		}
	}

	public final General_dataContext general_data() throws RecognitionException {
		General_dataContext _localctx = new General_dataContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_general_data);
		try {
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1570);
				atomic_word();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1571);
				general_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1572);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1573);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1574);
				match(Distinct_object);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1575);
				formula_data();
				}
				break;
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

	public static class General_functionContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public General_termsContext general_terms() {
			return getRuleContext(General_termsContext.class,0);
		}
		public General_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterGeneral_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitGeneral_function(this);
		}
	}

	public final General_functionContext general_function() throws RecognitionException {
		General_functionContext _localctx = new General_functionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_general_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			atomic_word();
			setState(1579);
			match(T__9);
			setState(1580);
			general_terms();
			setState(1581);
			match(T__10);
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

	public static class Formula_dataContext extends ParserRuleContext {
		public Thf_formulaContext thf_formula() {
			return getRuleContext(Thf_formulaContext.class,0);
		}
		public Tff_formulaContext tff_formula() {
			return getRuleContext(Tff_formulaContext.class,0);
		}
		public Fof_formulaContext fof_formula() {
			return getRuleContext(Fof_formulaContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public Fof_termContext fof_term() {
			return getRuleContext(Fof_termContext.class,0);
		}
		public Formula_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFormula_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFormula_data(this);
		}
	}

	public final Formula_dataContext formula_data() throws RecognitionException {
		Formula_dataContext _localctx = new Formula_dataContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_formula_data);
		try {
			setState(1603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(1583);
				match(T__38);
				setState(1584);
				thf_formula();
				setState(1585);
				match(T__10);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(1587);
				match(T__39);
				setState(1588);
				tff_formula();
				setState(1589);
				match(T__10);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 3);
				{
				setState(1591);
				match(T__40);
				setState(1592);
				fof_formula();
				setState(1593);
				match(T__10);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 4);
				{
				setState(1595);
				match(T__41);
				setState(1596);
				cnf_formula();
				setState(1597);
				match(T__10);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 5);
				{
				setState(1599);
				match(T__42);
				setState(1600);
				fof_term();
				setState(1601);
				match(T__10);
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

	public static class General_listContext extends ParserRuleContext {
		public General_termsContext general_terms() {
			return getRuleContext(General_termsContext.class,0);
		}
		public General_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterGeneral_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitGeneral_list(this);
		}
	}

	public final General_listContext general_list() throws RecognitionException {
		General_listContext _localctx = new General_listContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_general_list);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				match(T__16);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				match(T__11);
				setState(1607);
				general_terms();
				setState(1608);
				match(T__12);
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

	public static class General_termsContext extends ParserRuleContext {
		public List<General_termContext> general_term() {
			return getRuleContexts(General_termContext.class);
		}
		public General_termContext general_term(int i) {
			return getRuleContext(General_termContext.class,i);
		}
		public General_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterGeneral_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitGeneral_terms(this);
		}
	}

	public final General_termsContext general_terms() throws RecognitionException {
		General_termsContext _localctx = new General_termsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_general_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			general_term();
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1613);
				match(T__1);
				setState(1614);
				general_term();
				}
				}
				setState(1619);
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

	public static class NameContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public TerminalNode Integer() { return getToken(tptp_v7_0_0_0Parser.Integer, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_name);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
			case Single_quoted:
				enterOuterAlt(_localctx, 1);
				{
				setState(1620);
				atomic_word();
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1621);
				match(Integer);
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

	public static class Atomic_wordContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(tptp_v7_0_0_0Parser.Lower_word, 0); }
		public TerminalNode Single_quoted() { return getToken(tptp_v7_0_0_0Parser.Single_quoted, 0); }
		public Atomic_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAtomic_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAtomic_word(this);
		}
	}

	public final Atomic_wordContext atomic_word() throws RecognitionException {
		Atomic_wordContext _localctx = new Atomic_wordContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_atomic_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_la = _input.LA(1);
			if ( !(_la==Lower_word || _la==Single_quoted) ) {
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

	public static class Atomic_defined_wordContext extends ParserRuleContext {
		public TerminalNode Dollar_word() { return getToken(tptp_v7_0_0_0Parser.Dollar_word, 0); }
		public Atomic_defined_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_defined_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAtomic_defined_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAtomic_defined_word(this);
		}
	}

	public final Atomic_defined_wordContext atomic_defined_word() throws RecognitionException {
		Atomic_defined_wordContext _localctx = new Atomic_defined_wordContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_atomic_defined_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(Dollar_word);
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

	public static class Atomic_system_wordContext extends ParserRuleContext {
		public TerminalNode Dollar_dollar_word() { return getToken(tptp_v7_0_0_0Parser.Dollar_dollar_word, 0); }
		public Atomic_system_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_system_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterAtomic_system_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitAtomic_system_word(this);
		}
	}

	public final Atomic_system_wordContext atomic_system_word() throws RecognitionException {
		Atomic_system_wordContext _localctx = new Atomic_system_wordContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_atomic_system_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(Dollar_dollar_word);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(tptp_v7_0_0_0Parser.Integer, 0); }
		public TerminalNode Rational() { return getToken(tptp_v7_0_0_0Parser.Rational, 0); }
		public TerminalNode Real() { return getToken(tptp_v7_0_0_0Parser.Real, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Real - 74)) | (1L << (Rational - 74)) | (1L << (Integer - 74)))) != 0)) ) {
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

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode Single_quoted() { return getToken(tptp_v7_0_0_0Parser.Single_quoted, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tptp_v7_0_0_0Listener ) ((tptp_v7_0_0_0Listener)listener).exitFile_name(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			match(Single_quoted);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return thf_or_formula_sempred((Thf_or_formulaContext)_localctx, predIndex);
		case 19:
			return thf_and_formula_sempred((Thf_and_formulaContext)_localctx, predIndex);
		case 20:
			return thf_apply_formula_sempred((Thf_apply_formulaContext)_localctx, predIndex);
		case 41:
			return thf_xprod_type_sempred((Thf_xprod_typeContext)_localctx, predIndex);
		case 42:
			return thf_union_type_sempred((Thf_union_typeContext)_localctx, predIndex);
		case 53:
			return tff_or_formula_sempred((Tff_or_formulaContext)_localctx, predIndex);
		case 54:
			return tff_and_formula_sempred((Tff_and_formulaContext)_localctx, predIndex);
		case 84:
			return tff_xprod_type_sempred((Tff_xprod_typeContext)_localctx, predIndex);
		case 93:
			return fof_or_formula_sempred((Fof_or_formulaContext)_localctx, predIndex);
		case 94:
			return fof_and_formula_sempred((Fof_and_formulaContext)_localctx, predIndex);
		case 121:
			return cnf_disjunction_sempred((Cnf_disjunctionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean thf_or_formula_sempred(Thf_or_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_and_formula_sempred(Thf_and_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_apply_formula_sempred(Thf_apply_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_xprod_type_sempred(Thf_xprod_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_union_type_sempred(Thf_union_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tff_or_formula_sempred(Tff_or_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tff_and_formula_sempred(Tff_and_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tff_xprod_type_sempred(Tff_xprod_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fof_or_formula_sempred(Fof_or_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fof_and_formula_sempred(Fof_and_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cnf_disjunction_sempred(Cnf_disjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u0665\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\3\2\7\2\u0194\n\2\f\2\16\2\u0197\13\2\3\2\3\2\3\3\3\3"+
		"\5\3\u019d\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01a6\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u01af\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u01bc\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01c7\n\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01d2\n\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u01dd\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u01e8\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01f3\n\f\3"+
		"\f\3\f\3\r\3\r\3\r\5\r\u01fa\n\r\3\16\3\16\3\17\3\17\5\17\u0200\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u0206\n\20\3\21\3\21\3\21\5\21\u020b\n\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0214\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u021e\n\24\f\24\16\24\u0221\13\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u022b\n\25\f\25\16\25\u022e\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0238\n\26\f\26\16\26\u023b\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0247\n\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u0251\n\31\f\31\16\31\u0254"+
		"\13\31\3\31\3\31\3\31\3\32\3\32\5\32\u025b\n\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u026a\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u027c\n\36\3\37\3\37\3\37\5\37\u0281\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u029c\n$\3%"+
		"\3%\3%\3%\3&\3&\3&\5&\u02a5\n&\3\'\3\'\3(\3(\3)\3)\3)\5)\u02ae\n)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u02b8\n*\3+\3+\3+\3+\3+\3+\3+\3+\7+\u02c2\n+\f"+
		"+\16+\u02c5\13+\3,\3,\3,\3,\3,\3,\3,\3,\7,\u02cf\n,\f,\16,\u02d2\13,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\5-\u02dc\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02e8"+
		"\n.\3/\3/\3/\7/\u02ed\n/\f/\16/\u02f0\13/\3\60\3\60\5\60\u02f4\n\60\3"+
		"\61\3\61\3\62\3\62\3\62\5\62\u02fb\n\62\3\63\3\63\3\63\5\63\u0300\n\63"+
		"\3\64\3\64\5\64\u0304\n\64\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u030c\n"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0316\n\67\f\67\16\67"+
		"\u0319\13\67\38\38\38\38\38\38\38\38\78\u0323\n8\f8\168\u0326\138\39\3"+
		"9\39\39\39\39\39\39\39\59\u0331\n9\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\7;\u033d"+
		"\n;\f;\16;\u0340\13;\3<\3<\5<\u0344\n<\3=\3=\3=\3=\3>\3>\3>\3>\5>\u034e"+
		"\n>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u0366\nA\3B\3B\3B\3B\3B\5B\u036d\nB\3C\3C\3C\7C\u0372\nC\fC\16C\u0375"+
		"\13C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u037f\nD\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0389"+
		"\nE\3F\3F\3F\3F\3F\5F\u0390\nF\3G\3G\3G\7G\u0395\nG\fG\16G\u0398\13G\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\5H\u03a2\nH\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03ac\n"+
		"I\3J\3J\3J\3J\3J\3J\3J\3J\5J\u03b6\nJ\3K\3K\3K\3K\3K\5K\u03bd\nK\3L\3"+
		"L\3L\7L\u03c2\nL\fL\16L\u03c5\13L\3M\3M\3M\3M\3M\3M\3M\3M\5M\u03cf\nM"+
		"\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\5O\u03dc\nO\3P\3P\3P\3P\3P\3P\3P\3Q"+
		"\3Q\3Q\3Q\3Q\5Q\u03ea\nQ\3R\3R\3R\3R\3R\5R\u03f1\nR\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\5S\u03fb\nS\3T\3T\3T\7T\u0400\nT\fT\16T\u0403\13T\3U\3U\3U\3U\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\7V\u0411\nV\fV\16V\u0414\13V\3W\3W\5W\u0418\nW"+
		"\3X\3X\5X\u041c\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\5Z\u0427\nZ\3[\3[\5[\u042b"+
		"\n[\3\\\3\\\5\\\u042f\n\\\3]\3]\3]\3]\3^\3^\5^\u0437\n^\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\7_\u0441\n_\f_\16_\u0444\13_\3`\3`\3`\3`\3`\3`\3`\3`\7`\u044e"+
		"\n`\f`\16`\u0451\13`\3a\3a\3a\3a\3a\3a\3a\5a\u045a\na\3b\3b\3b\3b\3b\3"+
		"b\3b\3c\3c\3c\7c\u0466\nc\fc\16c\u0469\13c\3d\3d\3d\3d\5d\u046f\nd\3e"+
		"\3e\3e\3e\3f\3f\3f\5f\u0478\nf\3g\3g\3h\3h\5h\u047e\nh\3i\3i\3j\3j\3j"+
		"\3j\3k\3k\3l\3l\3l\3l\3l\3l\5l\u048e\nl\3m\3m\5m\u0492\nm\3n\3n\3o\3o"+
		"\3o\3o\3o\3o\5o\u049c\no\3p\3p\3p\3p\3p\3p\5p\u04a4\np\3q\3q\3q\7q\u04a9"+
		"\nq\fq\16q\u04ac\13q\3r\3r\3r\3r\3r\5r\u04b3\nr\3s\3s\3s\5s\u04b8\ns\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u04ce\n"+
		"u\3v\3v\3v\3v\3v\5v\u04d5\nv\3w\3w\3w\3w\3w\3w\3w\3w\5w\u04df\nw\3x\3"+
		"x\3x\3x\3x\5x\u04e6\nx\3y\3y\3y\7y\u04eb\ny\fy\16y\u04ee\13y\3z\3z\3z"+
		"\3z\3z\5z\u04f5\nz\3{\3{\3{\3{\3{\3{\7{\u04fd\n{\f{\16{\u0500\13{\3|\3"+
		"|\3|\3|\5|\u0506\n|\3}\3}\3}\5}\u050b\n}\3~\3~\3\177\3\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u0515\n\u0080\3\u0081\3\u0081\5\u0081\u0519\n"+
		"\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u051f\n\u0083\3\u0084\3"+
		"\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c"+
		"\u0533\n\u008c\3\u008d\3\u008d\5\u008d\u0537\n\u008d\3\u008e\3\u008e\3"+
		"\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\5\u0097\u054d\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0559\n\u0099\3\u009a\3\u009a"+
		"\3\u009a\7\u009a\u055e\n\u009a\f\u009a\16\u009a\u0561\13\u009a\3\u009b"+
		"\3\u009b\5\u009b\u0565\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u0576\n\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u057b\n"+
		"\u009f\f\u009f\16\u009f\u057e\13\u009f\3\u00a0\3\u00a0\5\u00a0\u0582\n"+
		"\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u058a\n"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0593\n\u00a4\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0598\n\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u05a2\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u05ab\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u05ba\n\u00ac"+
		"\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u05bf\n\u00ad\f\u00ad\16\u00ad\u05c2"+
		"\13\u00ad\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u05c7\n\u00ae\3\u00af\3\u00af"+
		"\5\u00af\u05cb\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u05d9\n\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u05e0\n\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\7\u00b9\u0600\n\u00b9\f\u00b9\16\u00b9\u0603\13\u00b9"+
		"\3\u00ba\3\u00ba\5\u00ba\u0607\n\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb"+
		"\u060c\n\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0618\n\u00bd\f\u00bd\16\u00bd\u061b"+
		"\13\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0623"+
		"\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u062b"+
		"\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0646\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u064d\n"+
		"\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0652\n\u00c3\f\u00c3\16\u00c3"+
		"\u0655\13\u00c3\3\u00c4\3\u00c4\5\u00c4\u0659\n\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\2\r&(*TVln\u00aa\u00bc\u00be\u00f4\u00ca\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\2\13\5\2??AACC\4\288==\7\2\67\67<<@@BBDD\4\2"+
		";;>>\3\2\60\65\3\2./\4\2::FF\3\2`a\5\2LLOORR\2\u0655\2\u0195\3\2\2\2\4"+
		"\u019c\3\2\2\2\6\u01a5\3\2\2\2\b\u01a7\3\2\2\2\n\u01b2\3\2\2\2\f\u01b4"+
		"\3\2\2\2\16\u01bf\3\2\2\2\20\u01ca\3\2\2\2\22\u01d5\3\2\2\2\24\u01e0\3"+
		"\2\2\2\26\u01eb\3\2\2\2\30\u01f6\3\2\2\2\32\u01fb\3\2\2\2\34\u01ff\3\2"+
		"\2\2\36\u0205\3\2\2\2 \u020a\3\2\2\2\"\u020c\3\2\2\2$\u0213\3\2\2\2&\u0215"+
		"\3\2\2\2(\u0222\3\2\2\2*\u022f\3\2\2\2,\u0246\3\2\2\2.\u0248\3\2\2\2\60"+
		"\u024b\3\2\2\2\62\u025a\3\2\2\2\64\u025c\3\2\2\2\66\u0260\3\2\2\28\u0269"+
		"\3\2\2\2:\u027b\3\2\2\2<\u0280\3\2\2\2>\u0282\3\2\2\2@\u028a\3\2\2\2B"+
		"\u0290\3\2\2\2D\u0292\3\2\2\2F\u029b\3\2\2\2H\u029d\3\2\2\2J\u02a4\3\2"+
		"\2\2L\u02a6\3\2\2\2N\u02a8\3\2\2\2P\u02ad\3\2\2\2R\u02b7\3\2\2\2T\u02b9"+
		"\3\2\2\2V\u02c6\3\2\2\2X\u02db\3\2\2\2Z\u02e7\3\2\2\2\\\u02e9\3\2\2\2"+
		"^\u02f3\3\2\2\2`\u02f5\3\2\2\2b\u02fa\3\2\2\2d\u02ff\3\2\2\2f\u0303\3"+
		"\2\2\2h\u0305\3\2\2\2j\u030b\3\2\2\2l\u030d\3\2\2\2n\u031a\3\2\2\2p\u0330"+
		"\3\2\2\2r\u0332\3\2\2\2t\u0339\3\2\2\2v\u0343\3\2\2\2x\u0345\3\2\2\2z"+
		"\u034d\3\2\2\2|\u034f\3\2\2\2~\u0351\3\2\2\2\u0080\u0365\3\2\2\2\u0082"+
		"\u036c\3\2\2\2\u0084\u036e\3\2\2\2\u0086\u037e\3\2\2\2\u0088\u0388\3\2"+
		"\2\2\u008a\u038f\3\2\2\2\u008c\u0391\3\2\2\2\u008e\u03a1\3\2\2\2\u0090"+
		"\u03ab\3\2\2\2\u0092\u03b5\3\2\2\2\u0094\u03bc\3\2\2\2\u0096\u03be\3\2"+
		"\2\2\u0098\u03ce\3\2\2\2\u009a\u03d0\3\2\2\2\u009c\u03db\3\2\2\2\u009e"+
		"\u03dd\3\2\2\2\u00a0\u03e9\3\2\2\2\u00a2\u03f0\3\2\2\2\u00a4\u03fa\3\2"+
		"\2\2\u00a6\u03fc\3\2\2\2\u00a8\u0404\3\2\2\2\u00aa\u0408\3\2\2\2\u00ac"+
		"\u0417\3\2\2\2\u00ae\u041b\3\2\2\2\u00b0\u041d\3\2\2\2\u00b2\u0426\3\2"+
		"\2\2\u00b4\u042a\3\2\2\2\u00b6\u042e\3\2\2\2\u00b8\u0430\3\2\2\2\u00ba"+
		"\u0436\3\2\2\2\u00bc\u0438\3\2\2\2\u00be\u0445\3\2\2\2\u00c0\u0459\3\2"+
		"\2\2\u00c2\u045b\3\2\2\2\u00c4\u0462\3\2\2\2\u00c6\u046e\3\2\2\2\u00c8"+
		"\u0470\3\2\2\2\u00ca\u0477\3\2\2\2\u00cc\u0479\3\2\2\2\u00ce\u047d\3\2"+
		"\2\2\u00d0\u047f\3\2\2\2\u00d2\u0481\3\2\2\2\u00d4\u0485\3\2\2\2\u00d6"+
		"\u048d\3\2\2\2\u00d8\u0491\3\2\2\2\u00da\u0493\3\2\2\2\u00dc\u049b\3\2"+
		"\2\2\u00de\u04a3\3\2\2\2\u00e0\u04a5\3\2\2\2\u00e2\u04b2\3\2\2\2\u00e4"+
		"\u04b7\3\2\2\2\u00e6\u04b9\3\2\2\2\u00e8\u04cd\3\2\2\2\u00ea\u04d4\3\2"+
		"\2\2\u00ec\u04de\3\2\2\2\u00ee\u04e5\3\2\2\2\u00f0\u04e7\3\2\2\2\u00f2"+
		"\u04f4\3\2\2\2\u00f4\u04f6\3\2\2\2\u00f6\u0505\3\2\2\2\u00f8\u050a\3\2"+
		"\2\2\u00fa\u050c\3\2\2\2\u00fc\u050e\3\2\2\2\u00fe\u0514\3\2\2\2\u0100"+
		"\u0518\3\2\2\2\u0102\u051a\3\2\2\2\u0104\u051e\3\2\2\2\u0106\u0520\3\2"+
		"\2\2\u0108\u0522\3\2\2\2\u010a\u0524\3\2\2\2\u010c\u0526\3\2\2\2\u010e"+
		"\u0528\3\2\2\2\u0110\u052a\3\2\2\2\u0112\u052c\3\2\2\2\u0114\u052e\3\2"+
		"\2\2\u0116\u0532\3\2\2\2\u0118\u0536\3\2\2\2\u011a\u0538\3\2\2\2\u011c"+
		"\u053a\3\2\2\2\u011e\u053c\3\2\2\2\u0120\u053e\3\2\2\2\u0122\u0540\3\2"+
		"\2\2\u0124\u0542\3\2\2\2\u0126\u0544\3\2\2\2\u0128\u0546\3\2\2\2\u012a"+
		"\u0548\3\2\2\2\u012c\u054c\3\2\2\2\u012e\u054e\3\2\2\2\u0130\u0558\3\2"+
		"\2\2\u0132\u055a\3\2\2\2\u0134\u0564\3\2\2\2\u0136\u0566\3\2\2\2\u0138"+
		"\u056e\3\2\2\2\u013a\u0575\3\2\2\2\u013c\u0577\3\2\2\2\u013e\u057f\3\2"+
		"\2\2\u0140\u0583\3\2\2\2\u0142\u0586\3\2\2\2\u0144\u058d\3\2\2\2\u0146"+
		"\u0592\3\2\2\2\u0148\u0594\3\2\2\2\u014a\u059b\3\2\2\2\u014c\u059e\3\2"+
		"\2\2\u014e\u05a5\3\2\2\2\u0150\u05a7\3\2\2\2\u0152\u05ae\3\2\2\2\u0154"+
		"\u05b0\3\2\2\2\u0156\u05b9\3\2\2\2\u0158\u05bb\3\2\2\2\u015a\u05c6\3\2"+
		"\2\2\u015c\u05ca\3\2\2\2\u015e\u05cc\3\2\2\2\u0160\u05d0\3\2\2\2\u0162"+
		"\u05d8\3\2\2\2\u0164\u05df\3\2\2\2\u0166\u05e1\3\2\2\2\u0168\u05e3\3\2"+
		"\2\2\u016a\u05ea\3\2\2\2\u016c\u05f0\3\2\2\2\u016e\u05f4\3\2\2\2\u0170"+
		"\u05fc\3\2\2\2\u0172\u0606\3\2\2\2\u0174\u0608\3\2\2\2\u0176\u060f\3\2"+
		"\2\2\u0178\u0614\3\2\2\2\u017a\u0622\3\2\2\2\u017c\u062a\3\2\2\2\u017e"+
		"\u062c\3\2\2\2\u0180\u0645\3\2\2\2\u0182\u064c\3\2\2\2\u0184\u064e\3\2"+
		"\2\2\u0186\u0658\3\2\2\2\u0188\u065a\3\2\2\2\u018a\u065c\3\2\2\2\u018c"+
		"\u065e\3\2\2\2\u018e\u0660\3\2\2\2\u0190\u0662\3\2\2\2\u0192\u0194\5\4"+
		"\3\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\2"+
		"\2\3\u0199\3\3\2\2\2\u019a\u019d\5\6\4\2\u019b\u019d\5\u0174\u00bb\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\5\3\2\2\2\u019e\u01a6\5\f\7\2"+
		"\u019f\u01a6\5\16\b\2\u01a0\u01a6\5\20\t\2\u01a1\u01a6\5\22\n\2\u01a2"+
		"\u01a6\5\24\13\2\u01a3\u01a6\5\26\f\2\u01a4\u01a6\5\b\5\2\u01a5\u019e"+
		"\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5"+
		"\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\7\3\2\2\2"+
		"\u01a7\u01a8\7\3\2\2\u01a8\u01a9\5\u0186\u00c4\2\u01a9\u01aa\7\4\2\2\u01aa"+
		"\u01ab\5\32\16\2\u01ab\u01ac\7\4\2\2\u01ac\u01ae\5\n\6\2\u01ad\u01af\5"+
		"\30\r\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\7\5\2\2\u01b1\t\3\2\2\2\u01b2\u01b3\5\u00b2Z\2\u01b3\13\3\2\2\2"+
		"\u01b4\u01b5\7\6\2\2\u01b5\u01b6\5\u0186\u00c4\2\u01b6\u01b7\7\4\2\2\u01b7"+
		"\u01b8\5\32\16\2\u01b8\u01b9\7\4\2\2\u01b9\u01bb\5\34\17\2\u01ba\u01bc"+
		"\5\30\r\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2"+
		"\u01bd\u01be\7\5\2\2\u01be\r\3\2\2\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\5"+
		"\u0186\u00c4\2\u01c1\u01c2\7\4\2\2\u01c2\u01c3\5\32\16\2\u01c3\u01c4\7"+
		"\4\2\2\u01c4\u01c6\5^\60\2\u01c5\u01c7\5\30\r\2\u01c6\u01c5\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\5\2\2\u01c9\17\3\2\2"+
		"\2\u01ca\u01cb\7\b\2\2\u01cb\u01cc\5\u0186\u00c4\2\u01cc\u01cd\7\4\2\2"+
		"\u01cd\u01ce\5\32\16\2\u01ce\u01cf\7\4\2\2\u01cf\u01d1\5b\62\2\u01d0\u01d2"+
		"\5\30\r\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2"+
		"\u01d3\u01d4\7\5\2\2\u01d4\21\3\2\2\2\u01d5\u01d6\7\t\2\2\u01d6\u01d7"+
		"\5\u0186\u00c4\2\u01d7\u01d8\7\4\2\2\u01d8\u01d9\5\32\16\2\u01d9\u01da"+
		"\7\4\2\2\u01da\u01dc\5\u00acW\2\u01db\u01dd\5\30\r\2\u01dc\u01db\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7\5\2\2\u01df\23"+
		"\3\2\2\2\u01e0\u01e1\7\n\2\2\u01e1\u01e2\5\u0186\u00c4\2\u01e2\u01e3\7"+
		"\4\2\2\u01e3\u01e4\5\32\16\2\u01e4\u01e5\7\4\2\2\u01e5\u01e7\5\u00b2Z"+
		"\2\u01e6\u01e8\5\30\r\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\7\5\2\2\u01ea\25\3\2\2\2\u01eb\u01ec\7\13\2"+
		"\2\u01ec\u01ed\5\u0186\u00c4\2\u01ed\u01ee\7\4\2\2\u01ee\u01ef\5\32\16"+
		"\2\u01ef\u01f0\7\4\2\2\u01f0\u01f2\5\u00f2z\2\u01f1\u01f3\5\30\r\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7\5"+
		"\2\2\u01f5\27\3\2\2\2\u01f6\u01f7\7\4\2\2\u01f7\u01f9\5\u0130\u0099\2"+
		"\u01f8\u01fa\5\u0154\u00ab\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\31\3\2\2\2\u01fb\u01fc\7`\2\2\u01fc\33\3\2\2\2\u01fd\u0200\5\36\20\2"+
		"\u01fe\u0200\5X-\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\35\3"+
		"\2\2\2\u0201\u0206\5 \21\2\u0202\u0206\5,\27\2\u0203\u0206\5D#\2\u0204"+
		"\u0206\5H%\2\u0205\u0201\3\2\2\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2"+
		"\2\u0205\u0204\3\2\2\2\u0206\37\3\2\2\2\u0207\u020b\5\"\22\2\u0208\u020b"+
		"\5$\23\2\u0209\u020b\5P)\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u0209\3\2\2\2\u020b!\3\2\2\2\u020c\u020d\5,\27\2\u020d\u020e\5\u00fe"+
		"\u0080\2\u020e\u020f\5,\27\2\u020f#\3\2\2\2\u0210\u0214\5&\24\2\u0211"+
		"\u0214\5(\25\2\u0212\u0214\5*\26\2\u0213\u0210\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0213\u0212\3\2\2\2\u0214%\3\2\2\2\u0215\u0216\b\24\1\2\u0216\u0217"+
		"\5,\27\2\u0217\u0218\7.\2\2\u0218\u0219\5,\27\2\u0219\u021f\3\2\2\2\u021a"+
		"\u021b\f\3\2\2\u021b\u021c\7.\2\2\u021c\u021e\5,\27\2\u021d\u021a\3\2"+
		"\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\'\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\b\25\1\2\u0223\u0224\5,\27"+
		"\2\u0224\u0225\7/\2\2\u0225\u0226\5,\27\2\u0226\u022c\3\2\2\2\u0227\u0228"+
		"\f\3\2\2\u0228\u0229\7/\2\2\u0229\u022b\5,\27\2\u022a\u0227\3\2\2\2\u022b"+
		"\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d)\3\2\2\2"+
		"\u022e\u022c\3\2\2\2\u022f\u0230\b\26\1\2\u0230\u0231\5,\27\2\u0231\u0232"+
		"\7E\2\2\u0232\u0233\5,\27\2\u0233\u0239\3\2\2\2\u0234\u0235\f\3\2\2\u0235"+
		"\u0236\7E\2\2\u0236\u0238\5,\27\2\u0237\u0234\3\2\2\2\u0238\u023b\3\2"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a+\3\2\2\2\u023b\u0239"+
		"\3\2\2\2\u023c\u0247\5.\30\2\u023d\u0247\5\66\34\2\u023e\u0247\58\35\2"+
		"\u023f\u0247\5> \2\u0240\u0247\5@!\2\u0241\u0247\5Z.\2\u0242\u0243\7\f"+
		"\2\2\u0243\u0244\5\36\20\2\u0244\u0245\7\r\2\2\u0245\u0247\3\2\2\2\u0246"+
		"\u023c\3\2\2\2\u0246\u023d\3\2\2\2\u0246\u023e\3\2\2\2\u0246\u023f\3\2"+
		"\2\2\u0246\u0240\3\2\2\2\u0246\u0241\3\2\2\2\u0246\u0242\3\2\2\2\u0247"+
		"-\3\2\2\2\u0248\u0249\5\60\31\2\u0249\u024a\5,\27\2\u024a/\3\2\2\2\u024b"+
		"\u024c\5\u00f8}\2\u024c\u024d\7\16\2\2\u024d\u0252\5\62\32\2\u024e\u024f"+
		"\7\4\2\2\u024f\u0251\5\62\32\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2\2\2"+
		"\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252"+
		"\3\2\2\2\u0255\u0256\7\17\2\2\u0256\u0257\7\20\2\2\u0257\61\3\2\2\2\u0258"+
		"\u025b\5\64\33\2\u0259\u025b\5\u012e\u0098\2\u025a\u0258\3\2\2\2\u025a"+
		"\u0259\3\2\2\2\u025b\63\3\2\2\2\u025c\u025d\5\u012e\u0098\2\u025d\u025e"+
		"\7\20\2\2\u025e\u025f\5J&\2\u025f\65\3\2\2\2\u0260\u0261\5\u0100\u0081"+
		"\2\u0261\u0262\7\f\2\2\u0262\u0263\5\36\20\2\u0263\u0264\7\r\2\2\u0264"+
		"\67\3\2\2\2\u0265\u026a\5:\36\2\u0266\u026a\5\u012e\u0098\2\u0267\u026a"+
		"\5\u012c\u0097\2\u0268\u026a\5<\37\2\u0269\u0265\3\2\2\2\u0269\u0266\3"+
		"\2\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a9\3\2\2\2\u026b\u027c"+
		"\5\u0116\u008c\2\u026c\u026d\5\u0122\u0092\2\u026d\u026e\7\f\2\2\u026e"+
		"\u026f\5B\"\2\u026f\u0270\7\r\2\2\u0270\u027c\3\2\2\2\u0271\u0272\5\u012a"+
		"\u0096\2\u0272\u0273\7\f\2\2\u0273\u0274\5B\"\2\u0274\u0275\7\r\2\2\u0275"+
		"\u027c\3\2\2\2\u0276\u0277\5\u0126\u0094\2\u0277\u0278\7\f\2\2\u0278\u0279"+
		"\5B\"\2\u0279\u027a\7\r\2\2\u027a\u027c\3\2\2\2\u027b\u026b\3\2\2\2\u027b"+
		"\u026c\3\2\2\2\u027b\u0271\3\2\2\2\u027b\u0276\3\2\2\2\u027c;\3\2\2\2"+
		"\u027d\u0281\5\u00fe\u0080\2\u027e\u0281\5\u010a\u0086\2\u027f\u0281\5"+
		"\u0100\u0081\2\u0280\u027d\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2"+
		"\2\2\u0281=\3\2\2\2\u0282\u0283\7\21\2\2\u0283\u0284\5\36\20\2\u0284\u0285"+
		"\7\4\2\2\u0285\u0286\5\36\20\2\u0286\u0287\7\4\2\2\u0287\u0288\5\36\20"+
		"\2\u0288\u0289\7\r\2\2\u0289?\3\2\2\2\u028a\u028b\7\22\2\2\u028b\u028c"+
		"\5,\27\2\u028c\u028d\7\4\2\2\u028d\u028e\5\34\17\2\u028e\u028f\7\r\2\2"+
		"\u028fA\3\2\2\2\u0290\u0291\5\\/\2\u0291C\3\2\2\2\u0292\u0293\5F$\2\u0293"+
		"\u0294\7\20\2\2\u0294\u0295\5J&\2\u0295E\3\2\2\2\u0296\u029c\58\35\2\u0297"+
		"\u0298\7\f\2\2\u0298\u0299\5\36\20\2\u0299\u029a\7\r\2\2\u029a\u029c\3"+
		"\2\2\2\u029b\u0296\3\2\2\2\u029b\u0297\3\2\2\2\u029cG\3\2\2\2\u029d\u029e"+
		"\58\35\2\u029e\u029f\7J\2\2\u029f\u02a0\58\35\2\u02a0I\3\2\2\2\u02a1\u02a5"+
		"\5L\'\2\u02a2\u02a5\5R*\2\u02a3\u02a5\5N(\2\u02a4\u02a1\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5K\3\2\2\2\u02a6\u02a7\5,\27\2"+
		"\u02a7M\3\2\2\2\u02a8\u02a9\5*\26\2\u02a9O\3\2\2\2\u02aa\u02ae\5R*\2\u02ab"+
		"\u02ae\5T+\2\u02ac\u02ae\5V,\2\u02ad\u02aa\3\2\2\2\u02ad\u02ab\3\2\2\2"+
		"\u02ad\u02ac\3\2\2\2\u02aeQ\3\2\2\2\u02af\u02b0\5L\'\2\u02b0\u02b1\7G"+
		"\2\2\u02b1\u02b2\5L\'\2\u02b2\u02b8\3\2\2\2\u02b3\u02b4\5L\'\2\u02b4\u02b5"+
		"\7G\2\2\u02b5\u02b6\5R*\2\u02b6\u02b8\3\2\2\2\u02b7\u02af\3\2\2\2\u02b7"+
		"\u02b3\3\2\2\2\u02b8S\3\2\2\2\u02b9\u02ba\b+\1\2\u02ba\u02bb\5L\'\2\u02bb"+
		"\u02bc\7H\2\2\u02bc\u02bd\5L\'\2\u02bd\u02c3\3\2\2\2\u02be\u02bf\f\3\2"+
		"\2\u02bf\u02c0\7H\2\2\u02c0\u02c2\5L\'\2\u02c1\u02be\3\2\2\2\u02c2\u02c5"+
		"\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4U\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c7\b,\1\2\u02c7\u02c8\5L\'\2\u02c8\u02c9\7I\2"+
		"\2\u02c9\u02ca\5L\'\2\u02ca\u02d0\3\2\2\2\u02cb\u02cc\f\3\2\2\u02cc\u02cd"+
		"\7I\2\2\u02cd\u02cf\5L\'\2\u02ce\u02cb\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1W\3\2\2\2\u02d2\u02d0\3\2\2\2"+
		"\u02d3\u02d4\5Z.\2\u02d4\u02d5\7K\2\2\u02d5\u02d6\5Z.\2\u02d6\u02dc\3"+
		"\2\2\2\u02d7\u02d8\7\f\2\2\u02d8\u02d9\5X-\2\u02d9\u02da\7\r\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02d3\3\2\2\2\u02db\u02d7\3\2\2\2\u02dcY\3\2\2\2"+
		"\u02dd\u02e8\7\23\2\2\u02de\u02df\7\16\2\2\u02df\u02e0\5\\/\2\u02e0\u02e1"+
		"\7\17\2\2\u02e1\u02e8\3\2\2\2\u02e2\u02e8\7\24\2\2\u02e3\u02e4\7\25\2"+
		"\2\u02e4\u02e5\5\\/\2\u02e5\u02e6\7\26\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02dd"+
		"\3\2\2\2\u02e7\u02de\3\2\2\2\u02e7\u02e2\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e8"+
		"[\3\2\2\2\u02e9\u02ee\5\36\20\2\u02ea\u02eb\7\4\2\2\u02eb\u02ed\5\36\20"+
		"\2\u02ec\u02ea\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef"+
		"\3\2\2\2\u02ef]\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f4\5`\61\2\u02f2"+
		"\u02f4\5X-\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4_\3\2\2\2\u02f5"+
		"\u02f6\5\36\20\2\u02f6a\3\2\2\2\u02f7\u02fb\5d\63\2\u02f8\u02fb\5\u0098"+
		"M\2\u02f9\u02fb\5\u0092J\2\u02fa\u02f7\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02f9\3\2\2\2\u02fbc\3\2\2\2\u02fc\u0300\5f\64\2\u02fd\u0300\5p9\2\u02fe"+
		"\u0300\5\u009aN\2\u02ff\u02fc\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe"+
		"\3\2\2\2\u0300e\3\2\2\2\u0301\u0304\5h\65\2\u0302\u0304\5j\66\2\u0303"+
		"\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304g\3\2\2\2\u0305\u0306\5p9\2\u0306"+
		"\u0307\5\u0108\u0085\2\u0307\u0308\5p9\2\u0308i\3\2\2\2\u0309\u030c\5"+
		"l\67\2\u030a\u030c\5n8\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030c"+
		"k\3\2\2\2\u030d\u030e\b\67\1\2\u030e\u030f\5p9\2\u030f\u0310\7.\2\2\u0310"+
		"\u0311\5p9\2\u0311\u0317\3\2\2\2\u0312\u0313\f\3\2\2\u0313\u0314\7.\2"+
		"\2\u0314\u0316\5p9\2\u0315\u0312\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315"+
		"\3\2\2\2\u0317\u0318\3\2\2\2\u0318m\3\2\2\2\u0319\u0317\3\2\2\2\u031a"+
		"\u031b\b8\1\2\u031b\u031c\5p9\2\u031c\u031d\7/\2\2\u031d\u031e\5p9\2\u031e"+
		"\u0324\3\2\2\2\u031f\u0320\f\3\2\2\u0320\u0321\7/\2\2\u0321\u0323\5p9"+
		"\2\u0322\u031f\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325o\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0331\5r:\2\u0328\u0331"+
		"\5z>\2\u0329\u0331\5|?\2\u032a\u0331\5~@\2\u032b\u0331\5\u0080A\2\u032c"+
		"\u032d\7\f\2\2\u032d\u032e\5d\63\2\u032e\u032f\7\r\2\2\u032f\u0331\3\2"+
		"\2\2\u0330\u0327\3\2\2\2\u0330\u0328\3\2\2\2\u0330\u0329\3\2\2\2\u0330"+
		"\u032a\3\2\2\2\u0330\u032b\3\2\2\2\u0330\u032c\3\2\2\2\u0331q\3\2\2\2"+
		"\u0332\u0333\5\u0106\u0084\2\u0333\u0334\7\16\2\2\u0334\u0335\5t;\2\u0335"+
		"\u0336\7\17\2\2\u0336\u0337\7\20\2\2\u0337\u0338\5p9\2\u0338s\3\2\2\2"+
		"\u0339\u033e\5v<\2\u033a\u033b\7\4\2\2\u033b\u033d\5v<\2\u033c\u033a\3"+
		"\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"u\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0344\5x=\2\u0342\u0344\5\u012e\u0098"+
		"\2\u0343\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344w\3\2\2\2\u0345\u0346"+
		"\5\u012e\u0098\2\u0346\u0347\7\20\2\2\u0347\u0348\5\u00a4S\2\u0348y\3"+
		"\2\2\2\u0349\u034a\5\u010c\u0087\2\u034a\u034b\5p9\2\u034b\u034e\3\2\2"+
		"\2\u034c\u034e\5\u00c8e\2\u034d\u0349\3\2\2\2\u034d\u034c\3\2\2\2\u034e"+
		"{\3\2\2\2\u034f\u0350\5\u00caf\2\u0350}\3\2\2\2\u0351\u0352\7\27\2\2\u0352"+
		"\u0353\5d\63\2\u0353\u0354\7\4\2\2\u0354\u0355\5d\63\2\u0355\u0356\7\4"+
		"\2\2\u0356\u0357\5d\63\2\u0357\u0358\7\r\2\2\u0358\177\3\2\2\2\u0359\u035a"+
		"\7\30\2\2\u035a\u035b\5\u0082B\2\u035b\u035c\7\4\2\2\u035c\u035d\5b\62"+
		"\2\u035d\u035e\7\r\2\2\u035e\u0366\3\2\2\2\u035f\u0360\7\31\2\2\u0360"+
		"\u0361\5\u008aF\2\u0361\u0362\7\4\2\2\u0362\u0363\5b\62\2\u0363\u0364"+
		"\7\r\2\2\u0364\u0366\3\2\2\2\u0365\u0359\3\2\2\2\u0365\u035f\3\2\2\2\u0366"+
		"\u0081\3\2\2\2\u0367\u036d\5\u0086D\2\u0368\u0369\7\16\2\2\u0369\u036a"+
		"\5\u0084C\2\u036a\u036b\7\17\2\2\u036b\u036d\3\2\2\2\u036c\u0367\3\2\2"+
		"\2\u036c\u0368\3\2\2\2\u036d\u0083\3\2\2\2\u036e\u0373\5\u0086D\2\u036f"+
		"\u0370\7\4\2\2\u0370\u0372\5\u0086D\2\u0371\u036f\3\2\2\2\u0372\u0375"+
		"\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0085\3\2\2\2\u0375"+
		"\u0373\3\2\2\2\u0376\u0377\7;\2\2\u0377\u0378\7\16\2\2\u0378\u0379\5t"+
		";\2\u0379\u037a\7\17\2\2\u037a\u037b\7\20\2\2\u037b\u037c\5\u0086D\2\u037c"+
		"\u037f\3\2\2\2\u037d\u037f\5\u0088E\2\u037e\u0376\3\2\2\2\u037e\u037d"+
		"\3\2\2\2\u037f\u0087\3\2\2\2\u0380\u0381\5\u00d6l\2\u0381\u0382\7:\2\2"+
		"\u0382\u0383\5\u00e2r\2\u0383\u0389\3\2\2\2\u0384\u0385\7\f\2\2\u0385"+
		"\u0386\5\u0088E\2\u0386\u0387\7\r\2\2\u0387\u0389\3\2\2\2\u0388\u0380"+
		"\3\2\2\2\u0388\u0384\3\2\2\2\u0389\u0089\3\2\2\2\u038a\u0390\5\u008eH"+
		"\2\u038b\u038c\7\16\2\2\u038c\u038d\5\u008cG\2\u038d\u038e\7\17\2\2\u038e"+
		"\u0390\3\2\2\2\u038f\u038a\3\2\2\2\u038f\u038b\3\2\2\2\u0390\u008b\3\2"+
		"\2\2\u0391\u0396\5\u008eH\2\u0392\u0393\7\4\2\2\u0393\u0395\5\u008eH\2"+
		"\u0394\u0392\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397"+
		"\3\2\2\2\u0397\u008d\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039a\7;\2\2\u039a"+
		"\u039b\7\16\2\2\u039b\u039c\5t;\2\u039c\u039d\7\17\2\2\u039d\u039e\7\20"+
		"\2\2\u039e\u039f\5\u008eH\2\u039f\u03a2\3\2\2\2\u03a0\u03a2\5\u0090I\2"+
		"\u03a1\u0399\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u008f\3\2\2\2\u03a3\u03a4"+
		"\5\u00ccg\2\u03a4\u03a5\7\60\2\2\u03a5\u03a6\5p9\2\u03a6\u03ac\3\2\2\2"+
		"\u03a7\u03a8\7\f\2\2\u03a8\u03a9\5\u0090I\2\u03a9\u03aa\7\r\2\2\u03aa"+
		"\u03ac\3\2\2\2\u03ab\u03a3\3\2\2\2\u03ab\u03a7\3\2\2\2\u03ac\u0091\3\2"+
		"\2\2\u03ad\u03ae\5\u0094K\2\u03ae\u03af\7K\2\2\u03af\u03b0\5\u0094K\2"+
		"\u03b0\u03b6\3\2\2\2\u03b1\u03b2\7\f\2\2\u03b2\u03b3\5\u0092J\2\u03b3"+
		"\u03b4\7\r\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03ad\3\2\2\2\u03b5\u03b1\3\2"+
		"\2\2\u03b6\u0093\3\2\2\2\u03b7\u03bd\7\23\2\2\u03b8\u03b9\7\16\2\2\u03b9"+
		"\u03ba\5\u0096L\2\u03ba\u03bb\7\17\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03b7"+
		"\3\2\2\2\u03bc\u03b8\3\2\2\2\u03bd\u0095\3\2\2\2\u03be\u03c3\5d\63\2\u03bf"+
		"\u03c0\7\4\2\2\u03c0\u03c2\5d\63\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5\3\2"+
		"\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u0097\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03c7\5\u0118\u008d\2\u03c7\u03c8\7\20\2\2\u03c8"+
		"\u03c9\5\u009cO\2\u03c9\u03cf\3\2\2\2\u03ca\u03cb\7\f\2\2\u03cb\u03cc"+
		"\5\u0098M\2\u03cc\u03cd\7\r\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03c6\3\2\2"+
		"\2\u03ce\u03ca\3\2\2\2\u03cf\u0099\3\2\2\2\u03d0\u03d1\5\u0118\u008d\2"+
		"\u03d1\u03d2\7J\2\2\u03d2\u03d3\5\u0116\u008c\2\u03d3\u009b\3\2\2\2\u03d4"+
		"\u03dc\5\u00a4S\2\u03d5\u03dc\5\u00a8U\2\u03d6\u03dc\5\u009eP\2\u03d7"+
		"\u03d8\7\f\2\2\u03d8\u03d9\5\u009cO\2\u03d9\u03da\7\r\2\2\u03da\u03dc"+
		"\3\2\2\2\u03db\u03d4\3\2\2\2\u03db\u03d5\3\2\2\2\u03db\u03d6\3\2\2\2\u03db"+
		"\u03d7\3\2\2\2\u03dc\u009d\3\2\2\2\u03dd\u03de\78\2\2\u03de\u03df\7\16"+
		"\2\2\u03df\u03e0\5t;\2\u03e0\u03e1\7\17\2\2\u03e1\u03e2\7\20\2\2\u03e2"+
		"\u03e3\5\u00a0Q\2\u03e3\u009f\3\2\2\2\u03e4\u03ea\5\u00a4S\2\u03e5\u03e6"+
		"\7\f\2\2\u03e6\u03e7\5\u00a8U\2\u03e7\u03e8\7\r\2\2\u03e8\u03ea\3\2\2"+
		"\2\u03e9\u03e4\3\2\2\2\u03e9\u03e5\3\2\2\2\u03ea\u00a1\3\2\2\2\u03eb\u03f1"+
		"\5\u00a4S\2\u03ec\u03ed\7\f\2\2\u03ed\u03ee\5\u00aaV\2\u03ee\u03ef\7\r"+
		"\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03eb\3\2\2\2\u03f0\u03ec\3\2\2\2\u03f1"+
		"\u00a3\3\2\2\2\u03f2\u03fb\5\u010e\u0088\2\u03f3\u03fb\5\u0112\u008a\2"+
		"\u03f4\u03f5\5\u0110\u0089\2\u03f5\u03f6\7\f\2\2\u03f6\u03f7\5\u00a6T"+
		"\2\u03f7\u03f8\7\r\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03fb\5\u012e\u0098\2"+
		"\u03fa\u03f2\3\2\2\2\u03fa\u03f3\3\2\2\2\u03fa\u03f4\3\2\2\2\u03fa\u03f9"+
		"\3\2\2\2\u03fb\u00a5\3\2\2\2\u03fc\u0401\5\u00a4S\2\u03fd\u03fe\7\4\2"+
		"\2\u03fe\u0400\5\u00a4S\2\u03ff\u03fd\3\2\2\2\u0400\u0403\3\2\2\2\u0401"+
		"\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u00a7\3\2\2\2\u0403\u0401\3\2"+
		"\2\2\u0404\u0405\5\u00a2R\2\u0405\u0406\7G\2\2\u0406\u0407\5\u00a4S\2"+
		"\u0407\u00a9\3\2\2\2\u0408\u0409\bV\1\2\u0409\u040a\5\u00a2R\2\u040a\u040b"+
		"\7H\2\2\u040b\u040c\5\u00a4S\2\u040c\u0412\3\2\2\2\u040d\u040e\f\3\2\2"+
		"\u040e\u040f\7H\2\2\u040f\u0411\5\u00a4S\2\u0410\u040d\3\2\2\2\u0411\u0414"+
		"\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u00ab\3\2\2\2\u0414"+
		"\u0412\3\2\2\2\u0415\u0418\5\u00aeX\2\u0416\u0418\5\u0098M\2\u0417\u0415"+
		"\3\2\2\2\u0417\u0416\3\2\2\2\u0418\u00ad\3\2\2\2\u0419\u041c\5\u00b0Y"+
		"\2\u041a\u041c\5\u00f2z\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c"+
		"\u00af\3\2\2\2\u041d\u041e\7;\2\2\u041e\u041f\7\16\2\2\u041f\u0420\5t"+
		";\2\u0420\u0421\7\17\2\2\u0421\u0422\7\20\2\2\u0422\u0423\5\u00f2z\2\u0423"+
		"\u00b1\3\2\2\2\u0424\u0427\5\u00b4[\2\u0425\u0427\5\u00ecw\2\u0426\u0424"+
		"\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u00b3\3\2\2\2\u0428\u042b\5\u00b6\\"+
		"\2\u0429\u042b\5\u00c0a\2\u042a\u0428\3\2\2\2\u042a\u0429\3\2\2\2\u042b"+
		"\u00b5\3\2\2\2\u042c\u042f\5\u00b8]\2\u042d\u042f\5\u00ba^\2\u042e\u042c"+
		"\3\2\2\2\u042e\u042d\3\2\2\2\u042f\u00b7\3\2\2\2\u0430\u0431\5\u00c0a"+
		"\2\u0431\u0432\5\u0108\u0085\2\u0432\u0433\5\u00c0a\2\u0433\u00b9\3\2"+
		"\2\2\u0434\u0437\5\u00bc_\2\u0435\u0437\5\u00be`\2\u0436\u0434\3\2\2\2"+
		"\u0436\u0435\3\2\2\2\u0437\u00bb\3\2\2\2\u0438\u0439\b_\1\2\u0439\u043a"+
		"\5\u00c0a\2\u043a\u043b\7.\2\2\u043b\u043c\5\u00c0a\2\u043c\u0442\3\2"+
		"\2\2\u043d\u043e\f\3\2\2\u043e\u043f\7.\2\2\u043f\u0441\5\u00c0a\2\u0440"+
		"\u043d\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2"+
		"\2\2\u0443\u00bd\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u0446\b`\1\2\u0446"+
		"\u0447\5\u00c0a\2\u0447\u0448\7/\2\2\u0448\u0449\5\u00c0a\2\u0449\u044f"+
		"\3\2\2\2\u044a\u044b\f\3\2\2\u044b\u044c\7/\2\2\u044c\u044e\5\u00c0a\2"+
		"\u044d\u044a\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u0450"+
		"\3\2\2\2\u0450\u00bf\3\2\2\2\u0451\u044f\3\2\2\2\u0452\u045a\5\u00c2b"+
		"\2\u0453\u045a\5\u00c6d\2\u0454\u045a\5\u00caf\2\u0455\u0456\7\f\2\2\u0456"+
		"\u0457\5\u00b4[\2\u0457\u0458\7\r\2\2\u0458\u045a\3\2\2\2\u0459\u0452"+
		"\3\2\2\2\u0459\u0453\3\2\2\2\u0459\u0454\3\2\2\2\u0459\u0455\3\2\2\2\u045a"+
		"\u00c1\3\2\2\2\u045b\u045c\5\u0106\u0084\2\u045c\u045d\7\16\2\2\u045d"+
		"\u045e\5\u00c4c\2\u045e\u045f\7\17\2\2\u045f\u0460\7\20\2\2\u0460\u0461"+
		"\5\u00c0a\2\u0461\u00c3\3\2\2\2\u0462\u0467\5\u012e\u0098\2\u0463\u0464"+
		"\7\4\2\2\u0464\u0466\5\u012e\u0098\2\u0465\u0463\3\2\2\2\u0466\u0469\3"+
		"\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u00c5\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u046a\u046b\5\u010c\u0087\2\u046b\u046c\5\u00c0a\2\u046c"+
		"\u046f\3\2\2\2\u046d\u046f\5\u00c8e\2\u046e\u046a\3\2\2\2\u046e\u046d"+
		"\3\2\2\2\u046f\u00c7\3\2\2\2\u0470\u0471\5\u00e2r\2\u0471\u0472\79\2\2"+
		"\u0472\u0473\5\u00e2r\2\u0473\u00c9\3\2\2\2\u0474\u0478\5\u00ccg\2\u0475"+
		"\u0478\5\u00ceh\2\u0476\u0478\5\u00d4k\2\u0477\u0474\3\2\2\2\u0477\u0475"+
		"\3\2\2\2\u0477\u0476\3\2\2\2\u0478\u00cb\3\2\2\2\u0479\u047a\5\u00d6l"+
		"\2\u047a\u00cd\3\2\2\2\u047b\u047e\5\u00d0i\2\u047c\u047e\5\u00d2j\2\u047d"+
		"\u047b\3\2\2\2\u047d\u047c\3\2\2\2\u047e\u00cf\3\2\2\2\u047f\u0480\5\u00d8"+
		"m\2\u0480\u00d1\3\2\2\2\u0481\u0482\5\u00e2r\2\u0482\u0483\5\u011e\u0090"+
		"\2\u0483\u0484\5\u00e2r\2\u0484\u00d3\3\2\2\2\u0485\u0486\5\u00dep\2\u0486"+
		"\u00d5\3\2\2\2\u0487\u048e\5\u0120\u0091\2\u0488\u0489\5\u0122\u0092\2"+
		"\u0489\u048a\7\f\2\2\u048a\u048b\5\u00e0q\2\u048b\u048c\7\r\2\2\u048c"+
		"\u048e\3\2\2\2\u048d\u0487\3\2\2\2\u048d\u0488\3\2\2\2\u048e\u00d7\3\2"+
		"\2\2\u048f\u0492\5\u012c\u0097\2\u0490\u0492\5\u00dan\2\u0491\u048f\3"+
		"\2\2\2\u0491\u0490\3\2\2\2\u0492\u00d9\3\2\2\2\u0493\u0494\5\u00dco\2"+
		"\u0494\u00db\3\2\2\2\u0495\u049c\5\u0128\u0095\2\u0496\u0497\5\u012a\u0096"+
		"\2\u0497\u0498\7\f\2\2\u0498\u0499\5\u00e0q\2\u0499\u049a\7\r\2\2\u049a"+
		"\u049c\3\2\2\2\u049b\u0495\3\2\2\2\u049b\u0496\3\2\2\2\u049c\u00dd\3\2"+
		"\2\2\u049d\u04a4\5\u0124\u0093\2\u049e\u049f\5\u0126\u0094\2\u049f\u04a0"+
		"\7\f\2\2\u04a0\u04a1\5\u00e0q\2\u04a1\u04a2\7\r\2\2\u04a2\u04a4\3\2\2"+
		"\2\u04a3\u049d\3\2\2\2\u04a3\u049e\3\2\2\2\u04a4\u00df\3\2\2\2\u04a5\u04aa"+
		"\5\u00e2r\2\u04a6\u04a7\7\4\2\2\u04a7\u04a9\5\u00e2r\2\u04a8\u04a6\3\2"+
		"\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u00e1\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04b3\5\u00e4s\2\u04ae\u04b3"+
		"\5\u012e\u0098\2\u04af\u04b3\5\u00e6t\2\u04b0\u04b3\5\u00e8u\2\u04b1\u04b3"+
		"\5\u00eav\2\u04b2\u04ad\3\2\2\2\u04b2\u04ae\3\2\2\2\u04b2\u04af\3\2\2"+
		"\2\u04b2\u04b0\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u00e3\3\2\2\2\u04b4\u04b8"+
		"\5\u00d6l\2\u04b5\u04b8\5\u00d8m\2\u04b6\u04b8\5\u00dep\2\u04b7\u04b4"+
		"\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b6\3\2\2\2\u04b8\u00e5\3\2\2\2\u04b9"+
		"\u04ba\7\32\2\2\u04ba\u04bb\5d\63\2\u04bb\u04bc\7\4\2\2\u04bc\u04bd\5"+
		"\u00e2r\2\u04bd\u04be\7\4\2\2\u04be\u04bf\5\u00e2r\2\u04bf\u04c0\7\r\2"+
		"\2\u04c0\u00e7\3\2\2\2\u04c1\u04c2\7\33\2\2\u04c2\u04c3\5\u008aF\2\u04c3"+
		"\u04c4\7\4\2\2\u04c4\u04c5\5\u00e2r\2\u04c5\u04c6\7\r\2\2\u04c6\u04ce"+
		"\3\2\2\2\u04c7\u04c8\7\34\2\2\u04c8\u04c9\5\u0082B\2\u04c9\u04ca\7\4\2"+
		"\2\u04ca\u04cb\5\u00e2r\2\u04cb\u04cc\7\r\2\2\u04cc\u04ce\3\2\2\2\u04cd"+
		"\u04c1\3\2\2\2\u04cd\u04c7\3\2\2\2\u04ce\u00e9\3\2\2\2\u04cf\u04d5\7\24"+
		"\2\2\u04d0\u04d1\7\25\2\2\u04d1\u04d2\5\u00e0q\2\u04d2\u04d3\7\26\2\2"+
		"\u04d3\u04d5\3\2\2\2\u04d4\u04cf\3\2\2\2\u04d4\u04d0\3\2\2\2\u04d5\u00eb"+
		"\3\2\2\2\u04d6\u04d7\5\u00eex\2\u04d7\u04d8\7K\2\2\u04d8\u04d9\5\u00ee"+
		"x\2\u04d9\u04df\3\2\2\2\u04da\u04db\7\f\2\2\u04db\u04dc\5\u00ecw\2\u04dc"+
		"\u04dd\7\r\2\2\u04dd\u04df\3\2\2\2\u04de\u04d6\3\2\2\2\u04de\u04da\3\2"+
		"\2\2\u04df\u00ed\3\2\2\2\u04e0\u04e6\7\23\2\2\u04e1\u04e2\7\16\2\2\u04e2"+
		"\u04e3\5\u00f0y\2\u04e3\u04e4\7\17\2\2\u04e4\u04e6\3\2\2\2\u04e5\u04e0"+
		"\3\2\2\2\u04e5\u04e1\3\2\2\2\u04e6\u00ef\3\2\2\2\u04e7\u04ec\5\u00b4["+
		"\2\u04e8\u04e9\7\4\2\2\u04e9\u04eb\5\u00b4[\2\u04ea\u04e8\3\2\2\2\u04eb"+
		"\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u00f1\3\2"+
		"\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f5\5\u00f4{\2\u04f0\u04f1\7\f\2\2\u04f1"+
		"\u04f2\5\u00f4{\2\u04f2\u04f3\7\r\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04ef"+
		"\3\2\2\2\u04f4\u04f0\3\2\2\2\u04f5\u00f3\3\2\2\2\u04f6\u04f7\b{\1\2\u04f7"+
		"\u04f8\5\u00f6|\2\u04f8\u04fe\3\2\2\2\u04f9\u04fa\f\3\2\2\u04fa\u04fb"+
		"\7.\2\2\u04fb\u04fd\5\u00f6|\2\u04fc\u04f9\3\2\2\2\u04fd\u0500\3\2\2\2"+
		"\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u00f5\3\2\2\2\u0500\u04fe"+
		"\3\2\2\2\u0501\u0506\5\u00caf\2\u0502\u0503\7\66\2\2\u0503\u0506\5\u00ca"+
		"f\2\u0504\u0506\5\u00c8e\2\u0505\u0501\3\2\2\2\u0505\u0502\3\2\2\2\u0505"+
		"\u0504\3\2\2\2\u0506\u00f7\3\2\2\2\u0507\u050b\5\u0106\u0084\2\u0508\u050b"+
		"\5\u00fa~\2\u0509\u050b\5\u00fc\177\2\u050a\u0507\3\2\2\2\u050a\u0508"+
		"\3\2\2\2\u050a\u0509\3\2\2\2\u050b\u00f9\3\2\2\2\u050c\u050d\t\2\2\2\u050d"+
		"\u00fb\3\2\2\2\u050e\u050f\t\3\2\2\u050f\u00fd\3\2\2\2\u0510\u0515\7:"+
		"\2\2\u0511\u0515\79\2\2\u0512\u0515\5\u0108\u0085\2\u0513\u0515\7F\2\2"+
		"\u0514\u0510\3\2\2\2\u0514\u0511\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0513"+
		"\3\2\2\2\u0515\u00ff\3\2\2\2\u0516\u0519\5\u010c\u0087\2\u0517\u0519\5"+
		"\u0102\u0082\2\u0518\u0516\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u0101\3\2"+
		"\2\2\u051a\u051b\t\4\2\2\u051b\u0103\3\2\2\2\u051c\u051f\5\u0108\u0085"+
		"\2\u051d\u051f\7F\2\2\u051e\u051c\3\2\2\2\u051e\u051d\3\2\2\2\u051f\u0105"+
		"\3\2\2\2\u0520\u0521\t\5\2\2\u0521\u0107\3\2\2\2\u0522\u0523\t\6\2\2\u0523"+
		"\u0109\3\2\2\2\u0524\u0525\t\7\2\2\u0525\u010b\3\2\2\2\u0526\u0527\7\66"+
		"\2\2\u0527\u010d\3\2\2\2\u0528\u0529\5\u0110\u0089\2\u0529\u010f\3\2\2"+
		"\2\u052a\u052b\5\u0188\u00c5\2\u052b\u0111\3\2\2\2\u052c\u052d\7]\2\2"+
		"\u052d\u0113\3\2\2\2\u052e\u052f\5\u018c\u00c7\2\u052f\u0115\3\2\2\2\u0530"+
		"\u0533\5\u0118\u008d\2\u0531\u0533\5\u0128\u0095\2\u0532\u0530\3\2\2\2"+
		"\u0532\u0531\3\2\2\2\u0533\u0117\3\2\2\2\u0534\u0537\5\u0120\u0091\2\u0535"+
		"\u0537\5\u0124\u0093\2\u0536\u0534\3\2\2\2\u0536\u0535\3\2\2\2\u0537\u0119"+
		"\3\2\2\2\u0538\u0539\7]\2\2\u0539\u011b\3\2\2\2\u053a\u053b\7]\2\2\u053b"+
		"\u011d\3\2\2\2\u053c\u053d\t\b\2\2\u053d\u011f\3\2\2\2\u053e\u053f\5\u0122"+
		"\u0092\2\u053f\u0121\3\2\2\2\u0540\u0541\5\u0188\u00c5\2\u0541\u0123\3"+
		"\2\2\2\u0542\u0543\5\u0126\u0094\2\u0543\u0125\3\2\2\2\u0544\u0545\5\u018c"+
		"\u00c7\2\u0545\u0127\3\2\2\2\u0546\u0547\5\u012a\u0096\2\u0547\u0129\3"+
		"\2\2\2\u0548\u0549\5\u018a\u00c6\2\u0549\u012b\3\2\2\2\u054a\u054d\5\u018e"+
		"\u00c8\2\u054b\u054d\7b\2\2\u054c\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054d"+
		"\u012d\3\2\2\2\u054e\u054f\7_\2\2\u054f\u012f\3\2\2\2\u0550\u0559\5\u0134"+
		"\u009b\2\u0551\u0559\5\u0142\u00a2\2\u0552\u0559\5\u0146\u00a4\2\u0553"+
		"\u0559\7`\2\2\u0554\u0555\7\16\2\2\u0555\u0556\5\u0132\u009a\2\u0556\u0557"+
		"\7\17\2\2\u0557\u0559\3\2\2\2\u0558\u0550\3\2\2\2\u0558\u0551\3\2\2\2"+
		"\u0558\u0552\3\2\2\2\u0558\u0553\3\2\2\2\u0558\u0554\3\2\2\2\u0559\u0131"+
		"\3\2\2\2\u055a\u055f\5\u0130\u0099\2\u055b\u055c\7\4\2\2\u055c\u055e\5"+
		"\u0130\u0099\2\u055d\u055b\3\2\2\2\u055e\u0561\3\2\2\2\u055f\u055d\3\2"+
		"\2\2\u055f\u0560\3\2\2\2\u0560\u0133\3\2\2\2\u0561\u055f\3\2\2\2\u0562"+
		"\u0565\5\u0186\u00c4\2\u0563\u0565\5\u0136\u009c\2\u0564\u0562\3\2\2\2"+
		"\u0564\u0563\3\2\2\2\u0565\u0135\3\2\2\2\u0566\u0567\7\35\2\2\u0567\u0568"+
		"\5\u0138\u009d\2\u0568\u0569\7\4\2\2\u0569\u056a\5\u0156\u00ac\2\u056a"+
		"\u056b\7\4\2\2\u056b\u056c\5\u013a\u009e\2\u056c\u056d\7\r\2\2\u056d\u0137"+
		"\3\2\2\2\u056e\u056f\5\u0188\u00c5\2\u056f\u0139\3\2\2\2\u0570\u0576\7"+
		"\23\2\2\u0571\u0572\7\16\2\2\u0572\u0573\5\u013c\u009f\2\u0573\u0574\7"+
		"\17\2\2\u0574\u0576\3\2\2\2\u0575\u0570\3\2\2\2\u0575\u0571\3\2\2\2\u0576"+
		"\u013b\3\2\2\2\u0577\u057c\5\u013e\u00a0\2\u0578\u0579\7\4\2\2\u0579\u057b"+
		"\5\u013e\u00a0\2\u057a\u0578\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a\3"+
		"\2\2\2\u057c\u057d\3\2\2\2\u057d\u013d\3\2\2\2\u057e\u057c\3\2\2\2\u057f"+
		"\u0581\5\u0130\u0099\2\u0580\u0582\5\u0140\u00a1\2\u0581\u0580\3\2\2\2"+
		"\u0581\u0582\3\2\2\2\u0582\u013f\3\2\2\2\u0583\u0584\7\20\2\2\u0584\u0585"+
		"\5\u0182\u00c2\2\u0585\u0141\3\2\2\2\u0586\u0587\7\36\2\2\u0587\u0589"+
		"\5\u0144\u00a3\2\u0588\u058a\5\u0154\u00ab\2\u0589\u0588\3\2\2\2\u0589"+
		"\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\7\r\2\2\u058c\u0143\3\2"+
		"\2\2\u058d\u058e\7`\2\2\u058e\u0145\3\2\2\2\u058f\u0593\5\u0148\u00a5"+
		"\2\u0590\u0593\5\u014c\u00a7\2\u0591\u0593\5\u0150\u00a9\2\u0592\u058f"+
		"\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u0147\3\2\2\2\u0594"+
		"\u0595\7\37\2\2\u0595\u0597\5\u0190\u00c9\2\u0596\u0598\5\u014a\u00a6"+
		"\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a"+
		"\7\r\2\2\u059a\u0149\3\2\2\2\u059b\u059c\7\4\2\2\u059c\u059d\5\u0186\u00c4"+
		"\2\u059d\u014b\3\2\2\2\u059e\u059f\7 \2\2\u059f\u05a1\5\u014e\u00a8\2"+
		"\u05a0\u05a2\5\u0154\u00ab\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2"+
		"\u05a3\3\2\2\2\u05a3\u05a4\7\r\2\2\u05a4\u014d\3\2\2\2\u05a5\u05a6\7`"+
		"\2\2\u05a6\u014f\3\2\2\2\u05a7\u05a8\7!\2\2\u05a8\u05aa\5\u0152\u00aa"+
		"\2\u05a9\u05ab\5\u0154\u00ab\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2"+
		"\u05ab\u05ac\3\2\2\2\u05ac\u05ad\7\r\2\2\u05ad\u0151\3\2\2\2\u05ae\u05af"+
		"\5\u0188\u00c5\2\u05af\u0153\3\2\2\2\u05b0\u05b1\7\4\2\2\u05b1\u05b2\5"+
		"\u0156\u00ac\2\u05b2\u0155\3\2\2\2\u05b3\u05ba\7\23\2\2\u05b4\u05b5\7"+
		"\16\2\2\u05b5\u05b6\5\u0158\u00ad\2\u05b6\u05b7\7\17\2\2\u05b7\u05ba\3"+
		"\2\2\2\u05b8\u05ba\5\u0182\u00c2\2\u05b9\u05b3\3\2\2\2\u05b9\u05b4\3\2"+
		"\2\2\u05b9\u05b8\3\2\2\2\u05ba\u0157\3\2\2\2\u05bb\u05c0\5\u015a\u00ae"+
		"\2\u05bc\u05bd\7\4\2\2\u05bd\u05bf\5\u015a\u00ae\2\u05be\u05bc\3\2\2\2"+
		"\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u0159"+
		"\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c7\5\u015c\u00af\2\u05c4\u05c7\5"+
		"\u0162\u00b2\2\u05c5\u05c7\5\u017e\u00c0\2\u05c6\u05c3\3\2\2\2\u05c6\u05c4"+
		"\3\2\2\2\u05c6\u05c5\3\2\2\2\u05c7\u015b\3\2\2\2\u05c8\u05cb\5\u015e\u00b0"+
		"\2\u05c9\u05cb\5\u0160\u00b1\2\u05ca\u05c8\3\2\2\2\u05ca\u05c9\3\2\2\2"+
		"\u05cb\u015d\3\2\2\2\u05cc\u05cd\7\"\2\2\u05cd\u05ce\5\u0188\u00c5\2\u05ce"+
		"\u05cf\7\r\2\2\u05cf\u015f\3\2\2\2\u05d0\u05d1\7#\2\2\u05d1\u05d2\5\u0188"+
		"\u00c5\2\u05d2\u05d3\7\r\2\2\u05d3\u0161\3\2\2\2\u05d4\u05d9\5\u0164\u00b3"+
		"\2\u05d5\u05d9\5\u016a\u00b6\2\u05d6\u05d9\5\u016e\u00b8\2\u05d7\u05d9"+
		"\5\u016c\u00b7\2\u05d8\u05d4\3\2\2\2\u05d8\u05d5\3\2\2\2\u05d8\u05d6\3"+
		"\2\2\2\u05d8\u05d7\3\2\2\2\u05d9\u0163\3\2\2\2\u05da\u05db\7$\2\2\u05db"+
		"\u05dc\5\u0166\u00b4\2\u05dc\u05dd\7\r\2\2\u05dd\u05e0\3\2\2\2\u05de\u05e0"+
		"\5\u0168\u00b5\2\u05df\u05da\3\2\2\2\u05df\u05de\3\2\2\2\u05e0\u0165\3"+
		"\2\2\2\u05e1\u05e2\7`\2\2\u05e2\u0167\3\2\2\2\u05e3\u05e4\5\u0138\u009d"+
		"\2\u05e4\u05e5\7\f\2\2\u05e5\u05e6\5\u0188\u00c5\2\u05e6\u05e7\7\4\2\2"+
		"\u05e7\u05e8\5\u0182\u00c2\2\u05e8\u05e9\7\r\2\2\u05e9\u0169\3\2\2\2\u05ea"+
		"\u05eb\7%\2\2\u05eb\u05ec\7\16\2\2\u05ec\u05ed\5\u0178\u00bd\2\u05ed\u05ee"+
		"\7\17\2\2\u05ee\u05ef\7\r\2\2\u05ef\u016b\3\2\2\2\u05f0\u05f1\7&\2\2\u05f1"+
		"\u05f2\5\u0148\u00a5\2\u05f2\u05f3\7\r\2\2\u05f3\u016d\3\2\2\2\u05f4\u05f5"+
		"\7\'\2\2\u05f5\u05f6\5\u0188\u00c5\2\u05f6\u05f7\7\4\2\2\u05f7\u05f8\7"+
		"\16\2\2\u05f8\u05f9\5\u0170\u00b9\2\u05f9\u05fa\7\17\2\2\u05fa\u05fb\7"+
		"\r\2\2\u05fb\u016f\3\2\2\2\u05fc\u0601\5\u0172\u00ba\2\u05fd\u05fe\7\4"+
		"\2\2\u05fe\u0600\5\u0172\u00ba\2\u05ff\u05fd\3\2\2\2\u0600\u0603\3\2\2"+
		"\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0171\3\2\2\2\u0603\u0601"+
		"\3\2\2\2\u0604\u0607\5\u0122\u0092\2\u0605\u0607\5\u012e\u0098\2\u0606"+
		"\u0604\3\2\2\2\u0606\u0605\3\2\2\2\u0607\u0173\3\2\2\2\u0608\u0609\7("+
		"\2\2\u0609\u060b\5\u0190\u00c9\2\u060a\u060c\5\u0176\u00bc\2\u060b\u060a"+
		"\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\7\5\2\2\u060e"+
		"\u0175\3\2\2\2\u060f\u0610\7\4\2\2\u0610\u0611\7\16\2\2\u0611\u0612\5"+
		"\u0178\u00bd\2\u0612\u0613\7\17\2\2\u0613\u0177\3\2\2\2\u0614\u0619\5"+
		"\u0186\u00c4\2\u0615\u0616\7\4\2\2\u0616\u0618\5\u0186\u00c4\2\u0617\u0615"+
		"\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a"+
		"\u0179\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u0623\5\u017c\u00bf\2\u061d\u061e"+
		"\5\u017c\u00bf\2\u061e\u061f\7\20\2\2\u061f\u0620\5\u017a\u00be\2\u0620"+
		"\u0623\3\2\2\2\u0621\u0623\5\u0182\u00c2\2\u0622\u061c\3\2\2\2\u0622\u061d"+
		"\3\2\2\2\u0622\u0621\3\2\2\2\u0623\u017b\3\2\2\2\u0624\u062b\5\u0188\u00c5"+
		"\2\u0625\u062b\5\u017e\u00c0\2\u0626\u062b\5\u012e\u0098\2\u0627\u062b"+
		"\5\u018e\u00c8\2\u0628\u062b\7b\2\2\u0629\u062b\5\u0180\u00c1\2\u062a"+
		"\u0624\3\2\2\2\u062a\u0625\3\2\2\2\u062a\u0626\3\2\2\2\u062a\u0627\3\2"+
		"\2\2\u062a\u0628\3\2\2\2\u062a\u0629\3\2\2\2\u062b\u017d\3\2\2\2\u062c"+
		"\u062d\5\u0188\u00c5\2\u062d\u062e\7\f\2\2\u062e\u062f\5\u0184\u00c3\2"+
		"\u062f\u0630\7\r\2\2\u0630\u017f\3\2\2\2\u0631\u0632\7)\2\2\u0632\u0633"+
		"\5\34\17\2\u0633\u0634\7\r\2\2\u0634\u0646\3\2\2\2\u0635\u0636\7*\2\2"+
		"\u0636\u0637\5b\62\2\u0637\u0638\7\r\2\2\u0638\u0646\3\2\2\2\u0639\u063a"+
		"\7+\2\2\u063a\u063b\5\u00b2Z\2\u063b\u063c\7\r\2\2\u063c\u0646\3\2\2\2"+
		"\u063d\u063e\7,\2\2\u063e\u063f\5\u00f2z\2\u063f\u0640\7\r\2\2\u0640\u0646"+
		"\3\2\2\2\u0641\u0642\7-\2\2\u0642\u0643\5\u00e2r\2\u0643\u0644\7\r\2\2"+
		"\u0644\u0646\3\2\2\2\u0645\u0631\3\2\2\2\u0645\u0635\3\2\2\2\u0645\u0639"+
		"\3\2\2\2\u0645\u063d\3\2\2\2\u0645\u0641\3\2\2\2\u0646\u0181\3\2\2\2\u0647"+
		"\u064d\7\23\2\2\u0648\u0649\7\16\2\2\u0649\u064a\5\u0184\u00c3\2\u064a"+
		"\u064b\7\17\2\2\u064b\u064d\3\2\2\2\u064c\u0647\3\2\2\2\u064c\u0648\3"+
		"\2\2\2\u064d\u0183\3\2\2\2\u064e\u0653\5\u017a\u00be\2\u064f\u0650\7\4"+
		"\2\2\u0650\u0652\5\u017a\u00be\2\u0651\u064f\3\2\2\2\u0652\u0655\3\2\2"+
		"\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0185\3\2\2\2\u0655\u0653"+
		"\3\2\2\2\u0656\u0659\5\u0188\u00c5\2\u0657\u0659\7R\2\2\u0658\u0656\3"+
		"\2\2\2\u0658\u0657\3\2\2\2\u0659\u0187\3\2\2\2\u065a\u065b\t\t\2\2\u065b"+
		"\u0189\3\2\2\2\u065c\u065d\7]\2\2\u065d\u018b\3\2\2\2\u065e\u065f\7^\2"+
		"\2\u065f\u018d\3\2\2\2\u0660\u0661\t\n\2\2\u0661\u018f\3\2\2\2\u0662\u0663"+
		"\7a\2\2\u0663\u0191\3\2\2\2\177\u0195\u019c\u01a5\u01ae\u01bb\u01c6\u01d1"+
		"\u01dc\u01e7\u01f2\u01f9\u01ff\u0205\u020a\u0213\u021f\u022c\u0239\u0246"+
		"\u0252\u025a\u0269\u027b\u0280\u029b\u02a4\u02ad\u02b7\u02c3\u02d0\u02db"+
		"\u02e7\u02ee\u02f3\u02fa\u02ff\u0303\u030b\u0317\u0324\u0330\u033e\u0343"+
		"\u034d\u0365\u036c\u0373\u037e\u0388\u038f\u0396\u03a1\u03ab\u03b5\u03bc"+
		"\u03c3\u03ce\u03db\u03e9\u03f0\u03fa\u0401\u0412\u0417\u041b\u0426\u042a"+
		"\u042e\u0436\u0442\u044f\u0459\u0467\u046e\u0477\u047d\u048d\u0491\u049b"+
		"\u04a3\u04aa\u04b2\u04b7\u04cd\u04d4\u04de\u04e5\u04ec\u04f4\u04fe\u0505"+
		"\u050a\u0514\u0518\u051e\u0532\u0536\u054c\u0558\u055f\u0564\u0575\u057c"+
		"\u0581\u0589\u0592\u0597\u05a1\u05aa\u05b9\u05c0\u05c6\u05ca\u05d8\u05df"+
		"\u0601\u0606\u060b\u0619\u0622\u062a\u0645\u064c\u0653\u0658";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}