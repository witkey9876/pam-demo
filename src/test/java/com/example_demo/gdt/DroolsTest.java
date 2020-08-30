//package com.example_demo.gdt;
//
//import com.example_demo.model.ActionResultDO;
//import com.example_demo.model.CustomerBindAccountDO;
//import com.example_demo.model.CustomerDO;
//import org.drools.compiler.kie.builder.impl.KieFileSystemImpl;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.kie.api.KieServices;
//import org.kie.api.builder.KieFileSystem;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieRuntimeFactory;
//import org.kie.api.runtime.KieSession;
//
//import java.util.Arrays;
//
//
//public class DroolsTest {
//
//    private   KieSession kSession;
//
//    public static void main(String[]args){
//        KieServices kieServices = KieServices.Factory.get();
//        KieContainer kContainer = kieServices.getKieClasspathContainer();
//        KieSession  kSession = kContainer.newKieSession();
//        CustomerBindAccountDO customerDO  = new CustomerBindAccountDO();
//        kSession.insert(Arrays.asList(customerDO));
//        kSession.getAgenda().getAgendaGroup("order1-condition").setFocus();
//        kSession.fireAllRules();
//    }
//
////    @Before
//    public void before(){
//        KieServices kieServices = KieServices.Factory.get();
//        KieContainer kContainer = kieServices.getKieClasspathContainer();
//        kSession = kContainer.newKieSession();
//
//    }
//
////    @Test
//    public void testLoginValidateTest(){
//        CustomerDO customerDO  = new CustomerDO();
//        customerDO.setStatus(1);
//        customerDO.setLoginAccount("redhat");
//        ActionResultDO actionResultDO = new ActionResultDO();
//        kSession.insert(Arrays.asList(customerDO,actionResultDO));
//        kSession.getAgenda().getAgendaGroup("LoginValidate").setFocus();
//        kSession.fireAllRules();
//        kSession.dispose();
//        Assert.assertEquals(Boolean.TRUE,actionResultDO.getBoolResult());
//    }
//
////    @Test
//    public void testOrderFire(){
//        CustomerBindAccountDO customerDO  = new CustomerBindAccountDO();
//        kSession.insert(Arrays.asList(customerDO));
//        kSession.getAgenda().getAgendaGroup("order1-condition").setFocus();
//        kSession.fireAllRules();
//
//
//    }
//}
