package com.example_demo.model;

import org.drools.core.spi.KnowledgeHelper;
import org.kie.api.runtime.KieSession;

import java.util.Objects;

public class KieSessionTools {

    public static final void fired(KnowledgeHelper helper,String groupName,Object ...facts){
        KieSession kieSession = helper.getKieRuntime().getKieBase().newKieSession();
        for(Object fact:facts) {
            kieSession.insert(fact);
        }
        if(Objects.nonNull(groupName)){
            kieSession.getAgenda().getAgendaGroup(groupName).setFocus();
        }
        kieSession.fireAllRules();
    }
}
