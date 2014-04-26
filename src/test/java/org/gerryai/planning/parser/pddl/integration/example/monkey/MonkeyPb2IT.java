package org.gerryai.planning.parser.pddl.integration.example.monkey;

import org.gerryai.planning.model.ConstantDefinition;
import org.gerryai.planning.model.problem.Goal;
import org.gerryai.planning.parser.pddl.integration.ProblemSuccessTester;
import org.junit.Test;

import static org.gerryai.planning.model.logic.FormulaBuilder.and;
import static org.gerryai.planning.model.logic.FormulaBuilder.constant;
import static org.gerryai.planning.model.logic.FormulaBuilder.predicate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Integration test to check that the Monkey example files are parsed correctly.
 */
public class MonkeyPb2IT extends ProblemSuccessTester {

    protected String getFilePath() {
        return "pddl/example/monkey/pb2.pddl";
    }

    @Test
    public void monkeyProblem2HasCorrectName() {
        assertEquals("pb2", problem.getName());
    }

    @Test
    public void monkeyProblem2HasCorrectDomain() {
        assertEquals("monkey", problem.getDomainName());
    }

    @Test
    public void monkeyProblem2HasNoRequirements() {
        assertEquals(0, problem.getRequirements().asSet().size());
    }


    @Test
    public void monkeyProblem2Has11Objects() {
        assertEquals(11, problem.getObjects().asSet().size());
    }

    @Test
    public void monkeyProblem2HasObjectP1() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("p1")));
    }

    @Test
    public void monkeyProblem2HasObjectP2() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("p2")));
    }

    @Test
    public void monkeyProblem2HasObjectP3() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("p3")));
    }

    @Test
    public void monkeyProblem2HasObjectP4() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("p4")));
    }

    @Test
    public void monkeyProblem2HasObjectP6() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("p6")));
    }

    @Test
    public void monkeyProblem2HasObjectBananas() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("bananas")));
    }

    @Test
    public void monkeyProblem2HasObjectMonkey() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("monkey")));
    }

    @Test
    public void monkeyProblem2HasObjectBox() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("box")));
    }

    @Test
    public void monkeyProblem2HasObjectKnife() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("knife")));
    }

    @Test
    public void monkeyProblem2HasObjectGlass() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("glass")));
    }

    @Test
    public void monkeyProblem2HasObjectWaterFountain() {
        assertTrue(problem.getObjects().asSet().contains(new ConstantDefinition("waterfountain")));
    }

    @Test
    public void monkeyProblem2Has12StateFormulas() {
        assertEquals(12, problem.getInitialState().asSet().size());
    }

    @Test
    public void monkeyProblem2InitialStateHasLocationP1() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("location", constant("p1"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasLocationP2() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("location", constant("p2"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasLocationP3() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("location", constant("p3"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasLocationP4() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("location", constant("p4"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasLocationP6() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("location", constant("p6"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasAtMonkeyP1() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("monkey"), constant("p1"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasLocationOnFloor() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("on-floor")));
    }

    @Test
    public void monkeyProblem2InitialStateHasAtBoxP2() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("box"), constant("p2"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasAtBananasP3() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("bananas"), constant("p3"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasAtKnifeP4() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("knife"), constant("p4"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasAtWaterFountainP3() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("waterfountain"), constant("p3"))));
    }

    @Test
    public void monkeyProblem2InitialStateHasAtGlassP6() {
        assertTrue(problem.getInitialState().asSet().contains(predicate("at", constant("glass"), constant("p6"))));
    }
    @Test
    public void monkeyProblem2HasGoal() {
        Goal goal = new Goal(
                and(
                        predicate("hasbananas"),
                        predicate("haswater")));
        assertEquals(goal, problem.getGoal());
    }
}
