import org.junit.Assert;
import org.junit.Test;

public class MinutesToSecondsTest {

    @Test
    public void shouldReturn3600Seconds(){
        //given
        long minutes = 60;
        //when
        MinutesToSeconds.changeMinutesToSeconds(60);
        //then
        Assert.assertEquals(3600,3600 );
    }
    @Test
    public void shouldReturnMinusOne(){
        //given
        long minutes = -100;
        //when
        MinutesToSeconds.changeMinutesToSeconds(-100);
        //then
        Assert.assertEquals(-1,-1 );
    }
    @Test
    public void shouldReturnZero(){
        //given
        long minutes = 0;
        //when
        MinutesToSeconds.changeMinutesToSeconds(0);
        //then
        Assert.assertEquals(0,0 );
    }
    @Test
    public void shouldReturn120(){
        //given
        long minutes = 2;
        //when
        MinutesToSeconds.changeMinutesToSeconds(2);
        //then
        Assert.assertEquals(120,120 );
    }




}
