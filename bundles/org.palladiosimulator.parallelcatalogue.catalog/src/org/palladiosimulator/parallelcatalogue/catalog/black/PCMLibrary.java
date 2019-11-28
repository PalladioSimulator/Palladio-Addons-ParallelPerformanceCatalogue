package org.palladiosimulator.parallelcatalogue.catalog.black;

import de.uka.ipd.sdq.simucomframework.Context;

public class PCMLibrary {

    public PCMLibrary() {
        super();
    }

    public static double evaluateStoEx(final String stoEx) {
        return Context.evaluateStatic(stoEx, Double.class);
    }

}
