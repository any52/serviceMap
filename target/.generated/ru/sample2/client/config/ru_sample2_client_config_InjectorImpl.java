package ru.sample2.client.config;

public class ru_sample2_client_config_InjectorImpl implements ru.sample2.client.config.Injector {
  
  /**
   * Top-level injector instance for injector interface ru.sample2.client.config.Injector.
   */
  private final ru_sample2_client_config_Injector_InjectorGinjector fieldru_sample2_client_config_Injector_InjectorGinjector = new ru_sample2_client_config_Injector_InjectorGinjector(this);
  public ru_sample2_client_config_InjectorImpl() {
    
  }
  
  public ru.sample2.client.ModelController getController() {
    return fieldru_sample2_client_config_Injector_InjectorGinjector.getFragment_ru_sample2_client().get_Key$type$ru$sample2$client$ModelController$_annotation$$none$$();
  }
  
  public ru.sample2.client.View getView() {
    return fieldru_sample2_client_config_Injector_InjectorGinjector.getFragment_ru_sample2_client().get_Key$type$ru$sample2$client$View$_annotation$$none$$();
  }
  
}
