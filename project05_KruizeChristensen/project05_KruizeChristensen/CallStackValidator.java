package project05_KruizeChristensen;

import java.util.regex.Matcher;  //was told as an alternate by another student for both of these
import java.util.regex.Pattern;

public class CallStackValidator{
	public static boolean isValid(String vali) {

		/**                      //code added from 237
		int call = 0;
		Stack<String> buffer= new DLLStack<>();
		int j = vali.indexOf('<');                            //find first '<' character (if any)
		while (j!= -1) {
			int k = vali.indexOf('>', j+1);                   //find next '>' character
			if (k == -1)
				return false;                                 //invalid tag
			String tag= vali.substring(j+1, k);               //strip away < >
			if (!tag.startsWith("/"))                         //this is an opening tag
				buffer.push(tag);
			else {                                            //this is a closing tag
				if (buffer.isEmpty( ))
					return false;                             //no tag to match
				if (!tag.substring(1).equals(buffer.pop()))
					return false;                             //mismatched tag
			}
			j = vali.indexOf('<', k+1);                       //find next '<' character (if any)
		}
		return buffer.isEmpty();                              //were all opening tags matched?
*/

	
	
	int call = 1;  //counts the time it appears 

//-----------times calls appears 
	Pattern p = Pattern.compile("calls");
	Matcher m = p.matcher( vali );
	while (m.find()) {
		call++;
	}
	
//------------times halts appears 
	Pattern pp = Pattern.compile("halts"); 
	Matcher mm = pp.matcher( vali );
	while (mm.find()) {
		call--;
	}

//----------------calculates if there is an accurate amounts of removed and add elements from the words
	
	if (call != 0) {
		return false;
	}else {
		return true;
	}		
	}
}
