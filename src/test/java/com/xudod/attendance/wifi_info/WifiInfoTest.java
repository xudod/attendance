package com.xudod.attendance.wifi_info;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.URL;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.http.ResponseEntity;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.Application;
import com.xudod.attendance.wifi_info.domain.entity.po.WifiInfo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WifiInfoTest {

	/*代码分界head TODO*/

	
	@LocalServerPort
    private int port;

    private URL base;
    
    private String uuid = "49fc8b39-fe92-4868-859d-79b825a34b6b";

	@Autowired
    private TestRestTemplate template;
    
    @Before
    public void setUp() throws Exception {
        String url = String.format("http://localhost:%d/wifiInfo/", port);
        System.out.println(String.format("port is : [%d]", port));
        this.base = new URL(url);
    } 
	
	//UserAttAppInfoTest基础测试部分
    
    @Test
    public void a_add() {
    	WifiInfo wifiInfo = new WifiInfo();
    	wifiInfo.setId(uuid);
    	// TODO
        ResponseEntity<BaseResp> response = template.postForEntity(base.toString(), wifiInfo, BaseResp.class);
        assertThat(response.getBody().getCode(), equalTo(0));
    }
    
    @Test
    public void b_upbykey() {
    	WifiInfo userAttAppInfoVo = new WifiInfo();
    	userAttAppInfoVo.setId(uuid);
        ResponseEntity<BaseResp> response = template.postForEntity(base.toString() + "upbykey", userAttAppInfoVo, BaseResp.class);
        assertThat(response.getBody().getCode(), equalTo(0));
    }
    
    @Test
    public void c_getbykey() {
    	OnlyId onlyId = new OnlyId();
    	onlyId.setId(uuid);
        ResponseEntity<BaseResp> response = template.postForEntity(base.toString() + "getbykey", onlyId, BaseResp.class);
        assertThat(response.getBody().getCode(), equalTo(0));
    }
    
    @Test
    public void d_delbykey() {
    	OnlyId onlyId = new OnlyId();
    	onlyId.setId(uuid);
        ResponseEntity<BaseResp> response = template.postForEntity(base.toString() + "delbykey", onlyId, BaseResp.class);
        assertThat(response.getBody().getCode(), equalTo(0));
    }
    
    @Test
    public void e_getpage() {
    	PageParameter<WifiInfo> pageParameter = new PageParameter<WifiInfo>();
    	
        ResponseEntity<BaseResp> response = template.postForEntity(base.toString() + "getpage", pageParameter, BaseResp.class);
        assertThat(response.getBody().getCode(), equalTo(0));
    }
	
	/*代码分界end TODO*/








}
