/*
 * Gerry AI - Open framework for automated planning
 * Copyright (c) 2014 David Edwards <david@more.fool.me.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gerryai.planning.model.problem;

import org.gerryai.planning.model.logic.Formula;

import java.util.Objects;

/**
 * Represents the goal of a planning problem, described by a formula.
 */
public class Goal {

    private Formula formula;

    /**
     * Constructor.
     * @param formula the formula describing the goal state
     */
    public Goal(final Formula formula) {
        this.formula = formula;
    }

    /**
     * Get the formula describing the goal state.
     * @return the formula
     */
    public Formula getFormula() {
        return formula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(formula);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Goal other = (Goal) obj;
        return Objects.equals(this.formula, other.formula);
    }
}
