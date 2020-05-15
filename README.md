# springcloud-dubbo

## Dubbo RPC 框架结合springcloud组件

###  目录结构说明 （使用nacos作为服务注册配置中心）

 * nacos-provider-api    dubbo服务api接口
 * nacos-provider-service    dubbo服务接口实现
 * provider-service2   dubbo服务接口实现（两台服务实例，实现dubbo负载均衡、服务容错、熔断）
 * nacos-consumer    dubbo服务消费方
 * service-roting    springcloud gateway实现统一网关路由、鉴权、限流
 
