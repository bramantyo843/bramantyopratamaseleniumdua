package org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.strategies;


//bramantyopratamaujiantiga.pageobjekbramantyopratama.Utils;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.Utils.Constants;

public class DriveStrategyImplementor {

    public static DriveStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

       //     case Constants.FIREFOX:
       //         return new Firefox();

            default:
                return null;
        }
    }
}
