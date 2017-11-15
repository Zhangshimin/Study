package mock;

import org.easymock.IArgumentMatcher;

import static org.easymock.EasyMock.reportMatcher;

public class SQLEquals implements IArgumentMatcher {
	
	private String expectedSQL = null;
	
	public SQLEquals(String expectedSQL) {
		this.expectedSQL = expectedSQL;
	}

	public void appendTo(StringBuffer buffer) {
		buffer.append("SQLEquals(\"" + expectedSQL + "\")");
	}

	public boolean matches(Object actualSQL) {
		if (actualSQL == null && expectedSQL == null)
			return true;
		else if (actualSQL instanceof String)
			return expectedSQL.equalsIgnoreCase((String) actualSQL);
		else
			return false;
	}
	
	public static String sqlEquals(String in) {
        reportMatcher(new SQLEquals(in));
        return in;
    } 

}
