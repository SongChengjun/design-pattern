package cn.com.song.design.pattern.adapter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class UserAdapterTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserAdapterTest.class);

    @Test
    public void getUserName() throws Exception {
        IUserInfo userInfo = new UserAdapter();
        LOGGER.info(userInfo.getUserName());
        LOGGER.info(userInfo.getMobile());
        LOGGER.info(userInfo.getJobPosition());
        new ArrayList<String>();

    }

}