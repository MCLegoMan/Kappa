package com.mclegoman.kappa.dev;

/*
 Kappa 1.0.0
 https://github.com/MCLegoMan/Kappa

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.kappa.common.KappaData;

public class KappaDev {
    public static void init(){
        try {
            if (KappaData.DEVELOPMENT_BUILD){
                KappaData.LOGGER.warn(KappaData.PREFIX + "This build of " + KappaData.NAME + " is currently under development.");
                KappaData.LOGGER.warn(KappaData.PREFIX + "You may experience some bugs or missing features.");
            }
        } catch (Exception e) {
            KappaData.LOGGER.warn(KappaData.PREFIX + "An error occurred whilst trying to initialize KappaDev for Server.");
        }
    }
    public static void initClient(){
        try {
            if (KappaData.DEVELOPMENT_BUILD){
                KappaData.LOGGER.warn(KappaData.PREFIX + "This build of " + KappaData.NAME + " is currently under development.");
                KappaData.LOGGER.warn(KappaData.PREFIX + "You may experience some bugs or missing features.");
            }
        } catch (Exception e) {
            KappaData.LOGGER.warn(KappaData.PREFIX + "An error occurred whilst trying to initialize KappaDev for Client.");
        }
    }
}
