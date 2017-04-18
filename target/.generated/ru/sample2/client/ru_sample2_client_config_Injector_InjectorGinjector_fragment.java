package ru.sample2.client;

import com.google.gwt.core.client.GWT;
import ru.sample2.client.config.ru_sample2_client_config_Injector_InjectorGinjector;

public class ru_sample2_client_config_Injector_InjectorGinjector_fragment {
  public void memberInject_Key$type$ru$sample2$client$ModelController$_annotation$$none$$(ru.sample2.client.ModelController injectee) {
    
  }
  
  public void memberInject_Key$type$ru$sample2$client$View$_annotation$$none$$(ru.sample2.client.View injectee) {
    
  }
  
  private ru.sample2.client.ModelController singleton_Key$type$ru$sample2$client$ModelController$_annotation$$none$$ = null;
  
  public ru.sample2.client.ModelController get_Key$type$ru$sample2$client$ModelController$_annotation$$none$$() {
    
    if (singleton_Key$type$ru$sample2$client$ModelController$_annotation$$none$$ == null) {
    ru.sample2.client.ModelController result = ru$sample2$client$ModelController_ru$sample2$client$ModelController_methodInjection(injector.getFragment_com_google_gwt_event_shared().get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$());
    memberInject_Key$type$ru$sample2$client$ModelController$_annotation$$none$$(result);
    
        singleton_Key$type$ru$sample2$client$ModelController$_annotation$$none$$ = result;
    }
    return singleton_Key$type$ru$sample2$client$ModelController$_annotation$$none$$;
    
  }
  
  public ru.sample2.client.ModelController ru$sample2$client$ModelController_ru$sample2$client$ModelController_methodInjection(com.google.gwt.event.shared.EventBus _0) {
    return new ru.sample2.client.ModelController(_0);
  }
  
  private ru.sample2.client.View singleton_Key$type$ru$sample2$client$View$_annotation$$none$$ = null;
  
  public ru.sample2.client.View get_Key$type$ru$sample2$client$View$_annotation$$none$$() {
    
    if (singleton_Key$type$ru$sample2$client$View$_annotation$$none$$ == null) {
    ru.sample2.client.View result = ru$sample2$client$View_ru$sample2$client$View_methodInjection(injector.getFragment_com_google_gwt_event_shared().get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$());
    memberInject_Key$type$ru$sample2$client$View$_annotation$$none$$(result);
    
        singleton_Key$type$ru$sample2$client$View$_annotation$$none$$ = result;
    }
    return singleton_Key$type$ru$sample2$client$View$_annotation$$none$$;
    
  }
  
  public ru.sample2.client.View ru$sample2$client$View_ru$sample2$client$View_methodInjection(com.google.gwt.event.shared.EventBus _0) {
    return new ru.sample2.client.View(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final ru_sample2_client_config_Injector_InjectorGinjector injector;
  public ru_sample2_client_config_Injector_InjectorGinjector_fragment(ru_sample2_client_config_Injector_InjectorGinjector injector) {
    this.injector = injector;
  }
  
}
