package org.gallant.data.sharding.jdbc.pool.config;

import io.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@Configuration
@ImportResource(locations = { "classpath:spring/*" })
@PropertySource("classpath:config/tomcat-jdbc.properties")
@ComponentScan(basePackages = "org.gallant.data")
@MapperScan("org.gallant.data.sharding.jdbc.pool.mapper")
public class AppContext {

    @Bean
    public DataSource dataSource() throws SQLException, IOException {
        Resource resource = new ClassPathResource("config/sharding-jdbc.yml");
        Map<String, DataSource> dataSourceMap = new HashMap<>(2);
        dataSourceMap.put("ds0", dataSource0());
        dataSourceMap.put("ds1", dataSource1());
        return YamlShardingDataSourceFactory.createDataSource(dataSourceMap, resource.getFile());
    }

    @ConfigurationProperties(prefix = "spring.datasource0")
    @Bean
    public DataSource dataSource0(){
        return DataSourceBuilder.create().build();
    }

    @ConfigurationProperties(prefix = "spring.datasource1")
    @Bean
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }

}