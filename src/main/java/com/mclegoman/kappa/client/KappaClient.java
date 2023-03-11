package com.mclegoman.kappa.client;

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
import net.fabricmc.api.ClientModInitializer;

public class KappaClient implements ClientModInitializer {
    private void sendStartupMessagesClient(){
        try {
            KappaData.LOGGER.info(KappaData.PREFIX + "Initializing KappaClient.");
            KappaDev.initClient();
        } catch (Exception e) {
            KappaData.LOGGER.warn(KappaData.PREFIX + "An error occurred whilst trying to initialize KappaClient.");
        }
    }
    @Override
    public void onInitializeClient() {
        try {
            sendStartupMessagesClient();
            KappaData.IS_CLIENT = true;
        } catch (Exception e) {
            KappaData.LOGGER.warn(KappaData.PREFIX + "An error occurred whilst trying to initialize KappaClient.");
        }
    }
}