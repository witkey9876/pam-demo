package com.example_demo.model;

import org.drools.core.spi.KnowledgeHelper;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionsPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class KieSessionTools {


    private static Logger Log  = LoggerFactory.getLogger("KieSessionTools");
    private static volatile KieSessionsPool sessionsPool;
    private static final Integer POOL_SIZE = 100;

    public static KieSessionsPool getSessionsPool(KnowledgeHelper helper){
        if(Objects.isNull(sessionsPool)) {
            synchronized (sessionsPool) {
                if(Objects.isNull(sessionsPool)) {
                    sessionsPool = helper.getKieRuntime().getKieBase().newKieSessionsPool(POOL_SIZE);
                }
            }
        }
        return sessionsPool;
    }

    public static final void fired(KnowledgeHelper helper,String groupName,Object ...facts){

        sessionsPool = getSessionsPool(helper);
//        KieSession kieSession = helper.getKieRuntime().getKieBase().newKieSession();
        KieSession kieSession = sessionsPool.newKieSession();
        for(Object fact:facts) {
            kieSession.insert(fact);
        }
        if(Objects.nonNull(groupName)){
            kieSession.getAgenda().getAgendaGroup(groupName).setFocus();
        }
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
