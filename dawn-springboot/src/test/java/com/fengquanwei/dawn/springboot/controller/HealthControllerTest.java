package com.fengquanwei.dawn.springboot.controller;

import com.fengquanwei.dawn.springboot.DawnSpringbootApplicationTests;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * 健康检查测试
 *
 * @author fengquanwei
 * @create 2018/12/22 16:58
 **/
public class HealthControllerTest extends DawnSpringbootApplicationTests {
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HealthController()).build();
    }

    @Test
    public void testCheck() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/health/check").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("success")));
    }
}
