package mo.essam;
import mo.essam.Operations.Calculator;
import mo.essam.Operations.CalculatotService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {

    Calculator calculator = null;
    CalculatotService service = Mockito.mock(CalculatotService.class);

    @Before
    public void init(){
        calculator = new Calculator(service);
    }

    @Test
    public void testAdd(){
        Mockito.when(service.add(2,7)).thenReturn(9);
        Assert.assertEquals(18,calculator.perform(2,7));
    }
}
