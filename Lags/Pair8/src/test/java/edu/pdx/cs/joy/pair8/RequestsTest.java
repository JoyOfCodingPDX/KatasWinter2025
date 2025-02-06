package edu.pdx.cs.joy.pair8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;


public class RequestsTest {

    @Test
    void canCreateRequest() {
        Requests testReq = new Requests("Test1", 1, 2,3);
        assertThat(testReq.plane, equalTo("Test1"));
        assertThat(testReq.startTime,equalTo(1));
        assertThat(testReq.endTime, equalTo(3));
        assertThat(testReq.price, equalTo(3));
    }

    @Test
    void canGetRequestList() {
        Lags lags = new Lags();
        Requests testReq = new Requests("Test1", 1, 2,3);
        Requests testReq2 = new Requests("Test2", 4, 3,5);
        lags.requestsList.add(testReq);
        lags.requestsList.add(testReq2);

        assertThat();

    }
}
