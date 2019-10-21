package mo.essam;
import mo.essam.Operations.Calculator;
import mo.essam.Operations.CalculatotService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestCalculator {

    Calculator calculator = null;
    @Mock
    CalculatotService service ;

    @Rule public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void init(){
        calculator = new Calculator(service);
    }

    @Test
    public void testAdd(){
        Mockito.when(service.add(2,7)).thenReturn(9);
        Assert.assertEquals(18,calculator.perform(2,7));
        Mockito.verify(service).add(2,7);
    }
}
