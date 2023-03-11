package com.mclegoman.kappa.server;

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
import com.mclegoman.kappa.dev.KappaDev;
import net.fabricmc.api.ModInitializer;

public class KappaServer implements ModInitializer {
    private void sendStartupMessages(){
        try {
            KappaData.LOGGER.info(KappaData.PREFIX + "Initializing KappaServer.");
            KappaDev.initClient();
        } catch (Exception e) {
            KappaData.LOGGER.warn(KappaData.PREFIX + "An error occurred whilst trying to initialize KappaServer.");
        }
    }
    @Override
    public void onInitialize() {
        try {
            sendStartupMessages();
            KappaData.init();
        } catch (Exception e) {
            KappaData.LOGGER.warn(KappaData.PREFIX + "An error occurred whilst trying to initialize KappaServer.");
        }
    }
}