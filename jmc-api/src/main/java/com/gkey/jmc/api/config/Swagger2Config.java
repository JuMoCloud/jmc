package com.gkey.jmc.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger2配置
 * @author GuoKey[wszghj@aliyun.com]
 *
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("X-Token").description("Token").modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).globalOperationParameters(pars).select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.gkey.jmc.api.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("朱朱墨亲子英语").contact(new Contact("zzm", "", "wszghj@aliyun.com"))
                .version("2.0").description("朱朱墨亲子英语服务端接口").build();
    }
}
