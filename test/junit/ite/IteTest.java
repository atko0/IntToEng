package junit.ite;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class IteTest {


	@Test
	public void 一桁テスト(){
		IntToEng ite = new IntToEng();
		String expected = "one";
		String  actual= ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	@Test
	public void 十代テスト(){
		IntToEng ite = new IntToEng();
		String expected = "twelve";
		String  actual= ite.translateEng(12);
		assertThat(actual,is(expected));
	}
	@Test
	public void 二十代テスト(){
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String  actual= ite.translateEng(20);
		assertThat(actual,is(expected));
	}

}
