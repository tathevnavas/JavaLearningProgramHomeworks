package hw2;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hw2.lfuCache.LFU;

public class lfuTest {
    @Test
    @DisplayName("Evict lfu cache test")
    void invalidCacheSizeTest(){
        var lfuCache = new LFU(2);
        lfuCache.refer("1");
        lfuCache.refer("2");
        lfuCache.refer("3");
        Assert.assertTrue(lfuCache.getCache().size() == 2);
        Assert.assertNull(lfuCache.getCache().get("1"));
    }
}
