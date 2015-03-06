package dcll.fbou.MySimpleStack;

import org.junit.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class SimpleStackImplTest extends TestCase {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis éxécuté avant chaque test");

    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1 + "2")));
        // taille doit up + 2
        Assert.assertEquals(2, simpleStack.getSize());

    }

    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        // pile doit up de un item
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();

        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);

    }

    public void testPeek() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        // pile doit up de un item
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertEquals(1, simpleStack.getSize());
        //on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }

    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        // pile doit up de un item
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        Assert.assertEquals(0, simpleStack.getSize());
        //on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }
}