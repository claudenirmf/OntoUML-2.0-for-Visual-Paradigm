/*
 * generated by Xtext 2.13.0
 */
package it.unibz.inf.ontouml.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class OntoUMLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsModelElementParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cElementsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cElementsModelElementParserRuleCall_3_1_0 = (RuleCall)cElementsAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Model:
		//	'Model'
		//	'{'
		//	elements+=ModelElement ("," elements+=ModelElement)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Model' '{' elements+=ModelElement ("," elements+=ModelElement)* '}'
		public Group getGroup() { return cGroup; }
		
		//'Model'
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//elements+=ModelElement
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//ModelElement
		public RuleCall getElementsModelElementParserRuleCall_2_0() { return cElementsModelElementParserRuleCall_2_0; }
		
		//("," elements+=ModelElement)*
		public Group getGroup_3() { return cGroup_3; }
		
		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//elements+=ModelElement
		public Assignment getElementsAssignment_3_1() { return cElementsAssignment_3_1; }
		
		//ModelElement
		public RuleCall getElementsModelElementParserRuleCall_3_1_0() { return cElementsModelElementParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ModelElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOntoUMLClassParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGeneralizationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGeneralizationSetParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////QualifiedName returns ecore::EString:
		////	ID ('.' ID)*;
		////QualifiedNameWithWildcard:
		////	QualifiedName '.*'?;
		//ModelElement:
		//	OntoUMLClass | Generalization | GeneralizationSet;
		@Override public ParserRule getRule() { return rule; }
		
		//OntoUMLClass | Generalization | GeneralizationSet
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//OntoUMLClass
		public RuleCall getOntoUMLClassParserRuleCall_0() { return cOntoUMLClassParserRuleCall_0; }
		
		//Generalization
		public RuleCall getGeneralizationParserRuleCall_1() { return cGeneralizationParserRuleCall_1; }
		
		//GeneralizationSet
		public RuleCall getGeneralizationSetParserRuleCall_2() { return cGeneralizationSetParserRuleCall_2; }
	}
	public class OntoUMLClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.OntoUMLClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment c_typeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall c_typeEndurantTypeEnumRuleCall_0_0 = (RuleCall)c_typeAssignment_0.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAliasAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAliasSTRINGTerminalRuleCall_3_0 = (RuleCall)cAliasAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSupersKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cGeneralizationsToSuperclassesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0 = (CrossReference)cGeneralizationsToSuperclassesAssignment_4_2.eContents().get(0);
		private final RuleCall cGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_2_0_1 = (RuleCall)cGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0.eContents().get(1);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cGeneralizationsToSuperclassesAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final CrossReference cGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0 = (CrossReference)cGeneralizationsToSuperclassesAssignment_4_3_1.eContents().get(0);
		private final RuleCall cGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_3_1_0_1 = (RuleCall)cGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cSubsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cGeneralizationsToSubclassesAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final CrossReference cGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0 = (CrossReference)cGeneralizationsToSubclassesAssignment_5_2.eContents().get(0);
		private final RuleCall cGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_2_0_1 = (RuleCall)cGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0.eContents().get(1);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cGeneralizationsToSubclassesAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final CrossReference cGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0 = (CrossReference)cGeneralizationsToSubclassesAssignment_5_3_1.eContents().get(0);
		private final RuleCall cGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_3_1_0_1 = (RuleCall)cGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		
		//OntoUMLClass:
		//	_type=EndurantType? 'Class' name=ID alias=STRING? ('supers...' '{' generalizationsToSuperclasses+=[Generalization]
		//	(',' generalizationsToSuperclasses+=[Generalization])* '}')? ('subs...' '{'
		//	generalizationsToSubclasses+=[Generalization] (',' generalizationsToSubclasses+=[Generalization])* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//_type=EndurantType? 'Class' name=ID alias=STRING? ('supers...' '{' generalizationsToSuperclasses+=[Generalization] (','
		//generalizationsToSuperclasses+=[Generalization])* '}')? ('subs...' '{' generalizationsToSubclasses+=[Generalization]
		//(',' generalizationsToSubclasses+=[Generalization])* '}')?
		public Group getGroup() { return cGroup; }
		
		//_type=EndurantType?
		public Assignment get_typeAssignment_0() { return c_typeAssignment_0; }
		
		//EndurantType
		public RuleCall get_typeEndurantTypeEnumRuleCall_0_0() { return c_typeEndurantTypeEnumRuleCall_0_0; }
		
		//'Class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//alias=STRING?
		public Assignment getAliasAssignment_3() { return cAliasAssignment_3; }
		
		//STRING
		public RuleCall getAliasSTRINGTerminalRuleCall_3_0() { return cAliasSTRINGTerminalRuleCall_3_0; }
		
		//('supers...' '{' generalizationsToSuperclasses+=[Generalization] (',' generalizationsToSuperclasses+=[Generalization])*
		//'}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'supers...'
		public Keyword getSupersKeyword_4_0() { return cSupersKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//generalizationsToSuperclasses+=[Generalization]
		public Assignment getGeneralizationsToSuperclassesAssignment_4_2() { return cGeneralizationsToSuperclassesAssignment_4_2; }
		
		//[Generalization]
		public CrossReference getGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0() { return cGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0; }
		
		//ID
		public RuleCall getGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_2_0_1() { return cGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_2_0_1; }
		
		//(',' generalizationsToSuperclasses+=[Generalization])*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//','
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//generalizationsToSuperclasses+=[Generalization]
		public Assignment getGeneralizationsToSuperclassesAssignment_4_3_1() { return cGeneralizationsToSuperclassesAssignment_4_3_1; }
		
		//[Generalization]
		public CrossReference getGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0() { return cGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0; }
		
		//ID
		public RuleCall getGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_3_1_0_1() { return cGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_3_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//('subs...' '{' generalizationsToSubclasses+=[Generalization] (',' generalizationsToSubclasses+=[Generalization])* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'subs...'
		public Keyword getSubsKeyword_5_0() { return cSubsKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//generalizationsToSubclasses+=[Generalization]
		public Assignment getGeneralizationsToSubclassesAssignment_5_2() { return cGeneralizationsToSubclassesAssignment_5_2; }
		
		//[Generalization]
		public CrossReference getGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0() { return cGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0; }
		
		//ID
		public RuleCall getGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_2_0_1() { return cGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_2_0_1; }
		
		//(',' generalizationsToSubclasses+=[Generalization])*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//','
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//generalizationsToSubclasses+=[Generalization]
		public Assignment getGeneralizationsToSubclassesAssignment_5_3_1() { return cGeneralizationsToSubclassesAssignment_5_3_1; }
		
		//[Generalization]
		public CrossReference getGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0() { return cGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0; }
		
		//ID
		public RuleCall getGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_3_1_0_1() { return cGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_3_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
	}
	public class GeneralizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.Generalization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGeneralizationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAliasAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAliasSTRINGTerminalRuleCall_2_0 = (RuleCall)cAliasAssignment_2.eContents().get(0);
		private final Keyword cSuperclassKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSuperclassAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cSuperclassOntoUMLClassCrossReference_4_0 = (CrossReference)cSuperclassAssignment_4.eContents().get(0);
		private final RuleCall cSuperclassOntoUMLClassIDTerminalRuleCall_4_0_1 = (RuleCall)cSuperclassOntoUMLClassCrossReference_4_0.eContents().get(1);
		private final Keyword cSubclassKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSubclassAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cSubclassOntoUMLClassCrossReference_6_0 = (CrossReference)cSubclassAssignment_6.eContents().get(0);
		private final RuleCall cSubclassOntoUMLClassIDTerminalRuleCall_6_0_1 = (RuleCall)cSubclassOntoUMLClassCrossReference_6_0.eContents().get(1);
		
		//// | PhaseMixin ;
		//Generalization:
		//	'Generalization' name=ID alias=STRING?
		//	'superclass' superclass=[OntoUMLClass] 'subclass' subclass=[OntoUMLClass];
		@Override public ParserRule getRule() { return rule; }
		
		//'Generalization' name=ID alias=STRING? 'superclass' superclass=[OntoUMLClass] 'subclass' subclass=[OntoUMLClass]
		public Group getGroup() { return cGroup; }
		
		//'Generalization'
		public Keyword getGeneralizationKeyword_0() { return cGeneralizationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//alias=STRING?
		public Assignment getAliasAssignment_2() { return cAliasAssignment_2; }
		
		//STRING
		public RuleCall getAliasSTRINGTerminalRuleCall_2_0() { return cAliasSTRINGTerminalRuleCall_2_0; }
		
		//'superclass'
		public Keyword getSuperclassKeyword_3() { return cSuperclassKeyword_3; }
		
		//superclass=[OntoUMLClass]
		public Assignment getSuperclassAssignment_4() { return cSuperclassAssignment_4; }
		
		//[OntoUMLClass]
		public CrossReference getSuperclassOntoUMLClassCrossReference_4_0() { return cSuperclassOntoUMLClassCrossReference_4_0; }
		
		//ID
		public RuleCall getSuperclassOntoUMLClassIDTerminalRuleCall_4_0_1() { return cSuperclassOntoUMLClassIDTerminalRuleCall_4_0_1; }
		
		//'subclass'
		public Keyword getSubclassKeyword_5() { return cSubclassKeyword_5; }
		
		//subclass=[OntoUMLClass]
		public Assignment getSubclassAssignment_6() { return cSubclassAssignment_6; }
		
		//[OntoUMLClass]
		public CrossReference getSubclassOntoUMLClassCrossReference_6_0() { return cSubclassOntoUMLClassCrossReference_6_0; }
		
		//ID
		public RuleCall getSubclassOntoUMLClassIDTerminalRuleCall_6_0_1() { return cSubclassOntoUMLClassIDTerminalRuleCall_6_0_1; }
	}
	public class GeneralizationSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.GeneralizationSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsDisjointAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsDisjointDisjointKeyword_0_0 = (Keyword)cIsDisjointAssignment_0.eContents().get(0);
		private final Assignment cIsCompleteAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsCompleteCompleteKeyword_1_0 = (Keyword)cIsCompleteAssignment_1.eContents().get(0);
		private final Keyword cGeneralizationSetKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cAliasAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAliasSTRINGTerminalRuleCall_4_0 = (RuleCall)cAliasAssignment_4.eContents().get(0);
		private final Keyword cGeneralizationsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cGeneralizationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cGeneralizationsGeneralizationCrossReference_7_0 = (CrossReference)cGeneralizationsAssignment_7.eContents().get(0);
		private final RuleCall cGeneralizationsGeneralizationIDTerminalRuleCall_7_0_1 = (RuleCall)cGeneralizationsGeneralizationCrossReference_7_0.eContents().get(1);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cCommaKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cGeneralizationsAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final CrossReference cGeneralizationsGeneralizationCrossReference_8_1_0 = (CrossReference)cGeneralizationsAssignment_8_1.eContents().get(0);
		private final RuleCall cGeneralizationsGeneralizationIDTerminalRuleCall_8_1_0_1 = (RuleCall)cGeneralizationsGeneralizationCrossReference_8_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//GeneralizationSet:
		//	isDisjoint?='disjoint' isComplete?='complete' 'GeneralizationSet' name=ID alias=STRING?
		//	'generalizations' '{' generalizations+=[Generalization] (',' generalizations+=[Generalization])* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//isDisjoint?='disjoint' isComplete?='complete' 'GeneralizationSet' name=ID alias=STRING? 'generalizations' '{'
		//generalizations+=[Generalization] (',' generalizations+=[Generalization])* '}'
		public Group getGroup() { return cGroup; }
		
		//isDisjoint?='disjoint'
		public Assignment getIsDisjointAssignment_0() { return cIsDisjointAssignment_0; }
		
		//'disjoint'
		public Keyword getIsDisjointDisjointKeyword_0_0() { return cIsDisjointDisjointKeyword_0_0; }
		
		//isComplete?='complete'
		public Assignment getIsCompleteAssignment_1() { return cIsCompleteAssignment_1; }
		
		//'complete'
		public Keyword getIsCompleteCompleteKeyword_1_0() { return cIsCompleteCompleteKeyword_1_0; }
		
		//'GeneralizationSet'
		public Keyword getGeneralizationSetKeyword_2() { return cGeneralizationSetKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//alias=STRING?
		public Assignment getAliasAssignment_4() { return cAliasAssignment_4; }
		
		//STRING
		public RuleCall getAliasSTRINGTerminalRuleCall_4_0() { return cAliasSTRINGTerminalRuleCall_4_0; }
		
		//'generalizations'
		public Keyword getGeneralizationsKeyword_5() { return cGeneralizationsKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//generalizations+=[Generalization]
		public Assignment getGeneralizationsAssignment_7() { return cGeneralizationsAssignment_7; }
		
		//[Generalization]
		public CrossReference getGeneralizationsGeneralizationCrossReference_7_0() { return cGeneralizationsGeneralizationCrossReference_7_0; }
		
		//ID
		public RuleCall getGeneralizationsGeneralizationIDTerminalRuleCall_7_0_1() { return cGeneralizationsGeneralizationIDTerminalRuleCall_7_0_1; }
		
		//(',' generalizations+=[Generalization])*
		public Group getGroup_8() { return cGroup_8; }
		
		//','
		public Keyword getCommaKeyword_8_0() { return cCommaKeyword_8_0; }
		
		//generalizations+=[Generalization]
		public Assignment getGeneralizationsAssignment_8_1() { return cGeneralizationsAssignment_8_1; }
		
		//[Generalization]
		public CrossReference getGeneralizationsGeneralizationCrossReference_8_1_0() { return cGeneralizationsGeneralizationCrossReference_8_1_0; }
		
		//ID
		public RuleCall getGeneralizationsGeneralizationIDTerminalRuleCall_8_1_0_1() { return cGeneralizationsGeneralizationIDTerminalRuleCall_8_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	
	public class EndurantTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.EndurantType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNoneEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNoneNoneKeyword_0_0 = (Keyword)cNoneEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cKindEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cKindKindKeyword_1_0 = (Keyword)cKindEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRelatorKindEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRelatorKindRelatorKindKeyword_2_0 = (Keyword)cRelatorKindEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cModeKindEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cModeKindModeKindKeyword_3_0 = (Keyword)cModeKindEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cQualityKindEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cQualityKindQualityKindKeyword_4_0 = (Keyword)cQualityKindEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cSubkindEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cSubkindSubkindKeyword_5_0 = (Keyword)cSubkindEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cRoleEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cRoleRoleKeyword_6_0 = (Keyword)cRoleEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cPhaseEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cPhasePhaseKeyword_7_0 = (Keyword)cPhaseEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cCategoryEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cCategoryCategoryKeyword_8_0 = (Keyword)cCategoryEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cMixinEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cMixinMixinKeyword_9_0 = (Keyword)cMixinEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cRoleMixinEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cRoleMixinRoleMixinKeyword_10_0 = (Keyword)cRoleMixinEnumLiteralDeclaration_10.eContents().get(0);
		
		//enum EndurantType:
		//	None="none" | Kind="kind" | RelatorKind="relatorKind" | ModeKind="modeKind" | QualityKind="qualityKind" |
		//	Subkind="subkind" | Role="role" | Phase="phase" | Category="category" | Mixin="mixin" | RoleMixin="roleMixin";
		public EnumRule getRule() { return rule; }
		
		//None="none" | Kind="kind" | RelatorKind="relatorKind" | ModeKind="modeKind" | QualityKind="qualityKind" |
		//Subkind="subkind" | Role="role" | Phase="phase" | Category="category" | Mixin="mixin" | RoleMixin="roleMixin"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//None="none"
		public EnumLiteralDeclaration getNoneEnumLiteralDeclaration_0() { return cNoneEnumLiteralDeclaration_0; }
		
		//"none"
		public Keyword getNoneNoneKeyword_0_0() { return cNoneNoneKeyword_0_0; }
		
		//Kind="kind"
		public EnumLiteralDeclaration getKindEnumLiteralDeclaration_1() { return cKindEnumLiteralDeclaration_1; }
		
		//"kind"
		public Keyword getKindKindKeyword_1_0() { return cKindKindKeyword_1_0; }
		
		//RelatorKind="relatorKind"
		public EnumLiteralDeclaration getRelatorKindEnumLiteralDeclaration_2() { return cRelatorKindEnumLiteralDeclaration_2; }
		
		//"relatorKind"
		public Keyword getRelatorKindRelatorKindKeyword_2_0() { return cRelatorKindRelatorKindKeyword_2_0; }
		
		//ModeKind="modeKind"
		public EnumLiteralDeclaration getModeKindEnumLiteralDeclaration_3() { return cModeKindEnumLiteralDeclaration_3; }
		
		//"modeKind"
		public Keyword getModeKindModeKindKeyword_3_0() { return cModeKindModeKindKeyword_3_0; }
		
		//QualityKind="qualityKind"
		public EnumLiteralDeclaration getQualityKindEnumLiteralDeclaration_4() { return cQualityKindEnumLiteralDeclaration_4; }
		
		//"qualityKind"
		public Keyword getQualityKindQualityKindKeyword_4_0() { return cQualityKindQualityKindKeyword_4_0; }
		
		//Subkind="subkind"
		public EnumLiteralDeclaration getSubkindEnumLiteralDeclaration_5() { return cSubkindEnumLiteralDeclaration_5; }
		
		//"subkind"
		public Keyword getSubkindSubkindKeyword_5_0() { return cSubkindSubkindKeyword_5_0; }
		
		//Role="role"
		public EnumLiteralDeclaration getRoleEnumLiteralDeclaration_6() { return cRoleEnumLiteralDeclaration_6; }
		
		//"role"
		public Keyword getRoleRoleKeyword_6_0() { return cRoleRoleKeyword_6_0; }
		
		//Phase="phase"
		public EnumLiteralDeclaration getPhaseEnumLiteralDeclaration_7() { return cPhaseEnumLiteralDeclaration_7; }
		
		//"phase"
		public Keyword getPhasePhaseKeyword_7_0() { return cPhasePhaseKeyword_7_0; }
		
		//Category="category"
		public EnumLiteralDeclaration getCategoryEnumLiteralDeclaration_8() { return cCategoryEnumLiteralDeclaration_8; }
		
		//"category"
		public Keyword getCategoryCategoryKeyword_8_0() { return cCategoryCategoryKeyword_8_0; }
		
		//Mixin="mixin"
		public EnumLiteralDeclaration getMixinEnumLiteralDeclaration_9() { return cMixinEnumLiteralDeclaration_9; }
		
		//"mixin"
		public Keyword getMixinMixinKeyword_9_0() { return cMixinMixinKeyword_9_0; }
		
		//RoleMixin="roleMixin"
		public EnumLiteralDeclaration getRoleMixinEnumLiteralDeclaration_10() { return cRoleMixinEnumLiteralDeclaration_10; }
		
		//"roleMixin"
		public Keyword getRoleMixinRoleMixinKeyword_10_0() { return cRoleMixinRoleMixinKeyword_10_0; }
	}
	
	private final ModelElements pModel;
	private final ModelElementElements pModelElement;
	private final OntoUMLClassElements pOntoUMLClass;
	private final EndurantTypeElements eEndurantType;
	private final GeneralizationElements pGeneralization;
	private final GeneralizationSetElements pGeneralizationSet;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OntoUMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pModelElement = new ModelElementElements();
		this.pOntoUMLClass = new OntoUMLClassElements();
		this.eEndurantType = new EndurantTypeElements();
		this.pGeneralization = new GeneralizationElements();
		this.pGeneralizationSet = new GeneralizationSetElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("it.unibz.inf.ontouml.xtext.OntoUML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	'Model'
	//	'{'
	//	elements+=ModelElement ("," elements+=ModelElement)*
	//	'}';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	////QualifiedName returns ecore::EString:
	////	ID ('.' ID)*;
	////QualifiedNameWithWildcard:
	////	QualifiedName '.*'?;
	//ModelElement:
	//	OntoUMLClass | Generalization | GeneralizationSet;
	public ModelElementElements getModelElementAccess() {
		return pModelElement;
	}
	
	public ParserRule getModelElementRule() {
		return getModelElementAccess().getRule();
	}
	
	//OntoUMLClass:
	//	_type=EndurantType? 'Class' name=ID alias=STRING? ('supers...' '{' generalizationsToSuperclasses+=[Generalization]
	//	(',' generalizationsToSuperclasses+=[Generalization])* '}')? ('subs...' '{'
	//	generalizationsToSubclasses+=[Generalization] (',' generalizationsToSubclasses+=[Generalization])* '}')?;
	public OntoUMLClassElements getOntoUMLClassAccess() {
		return pOntoUMLClass;
	}
	
	public ParserRule getOntoUMLClassRule() {
		return getOntoUMLClassAccess().getRule();
	}
	
	//enum EndurantType:
	//	None="none" | Kind="kind" | RelatorKind="relatorKind" | ModeKind="modeKind" | QualityKind="qualityKind" |
	//	Subkind="subkind" | Role="role" | Phase="phase" | Category="category" | Mixin="mixin" | RoleMixin="roleMixin";
	public EndurantTypeElements getEndurantTypeAccess() {
		return eEndurantType;
	}
	
	public EnumRule getEndurantTypeRule() {
		return getEndurantTypeAccess().getRule();
	}
	
	//// | PhaseMixin ;
	//Generalization:
	//	'Generalization' name=ID alias=STRING?
	//	'superclass' superclass=[OntoUMLClass] 'subclass' subclass=[OntoUMLClass];
	public GeneralizationElements getGeneralizationAccess() {
		return pGeneralization;
	}
	
	public ParserRule getGeneralizationRule() {
		return getGeneralizationAccess().getRule();
	}
	
	//GeneralizationSet:
	//	isDisjoint?='disjoint' isComplete?='complete' 'GeneralizationSet' name=ID alias=STRING?
	//	'generalizations' '{' generalizations+=[Generalization] (',' generalizations+=[Generalization])* '}';
	public GeneralizationSetElements getGeneralizationSetAccess() {
		return pGeneralizationSet;
	}
	
	public ParserRule getGeneralizationSetRule() {
		return getGeneralizationSetAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
