package com.mclegoman.kappa.common;

/*
 Kappa 1.0.0
 https://github.com/MCLegoMan/Kappa

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KappaData {
    public static final String NAME = "Kappa";
    public static final String ID = "kappa";
    public static final String VERSION = "1.0.0";
    public static final String MC_VERSION = "1.19.2";
    public static final String PREFIX = "[" + NAME + " " + VERSION + "] ";
    public static final Boolean DEVELOPMENT_BUILD = false;
    public static final ModContainer CONTAINER = FabricLoader.getInstance().getModContainer(ID).get();
    public static final Logger LOGGER = LoggerFactory.getLogger(KappaData.ID);
    public static boolean IS_CLIENT;
    public static void init() {
        LOGGER.info(PREFIX + "Initializing KappaData.");
    }
}