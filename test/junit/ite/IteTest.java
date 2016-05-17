package junit.ite;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class IteTest {

	@Test
	public void テスト0(){
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String  actual= ite.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト1(){
		IntToEng ite = new IntToEng();
		String expected = "one";
		String  actual= ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト12(){
		IntToEng ite = new IntToEng();
		String expected = "twelve";
		String  actual= ite.translateEng(12);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト20(){
		IntToEng ite = new IntToEng();
		String expected = "twenty ";
		String  actual= ite.translateEng(20);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト31(){
		IntToEng ite = new IntToEng();
		String expected = "thirty one";
		String  actual= ite.translateEng(31);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト100(){
		IntToEng ite = new IntToEng();
		String expected = "hundred";
		String  actual= ite.translateEng(100);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト108(){
		IntToEng ite = new IntToEng();
		String expected = "one hundred eight";
		String  actual= ite.translateEng(108);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト117(){
		IntToEng ite = new IntToEng();
		String expected = "one hundred seventeen";
		String  actual= ite.translateEng(117);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト141(){
		IntToEng ite = new IntToEng();
		String expected = "one hundred forty one";
		String  actual= ite.translateEng(141);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト567(){
		IntToEng ite = new IntToEng();
		String expected = "five hundred sixty seven";
		String  actual= ite.translateEng(567);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト1000(){
		IntToEng ite = new IntToEng();
		String expected = "thousand";
		String  actual= ite.translateEng(1000);
		assertThat(actual,is(expected));
	}
	@Test
	public void テスト範囲外(){
		IntToEng ite = new IntToEng();
		String expected = "範囲外です";
		String  actual= ite.translateEng(1001);
		assertThat(actual,is(expected));
	}
}
