package com.ccc.sendxalyzeit.textanalytics.stackexchange.reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
/**
 * Reader for stack exchange, meant for extracting titles from the 
 * stack exchange dumps
 * @author Adam Gibson
 *
 */
public class Reader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		File f = new File( args[ 0 ] );
		JAXBContext jaxbContext = JAXBContext.newInstance( Posts.class,Row.class );
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Posts posts = (Posts) jaxbUnmarshaller.unmarshal( f );
		System.out.println( posts.getRow().size() );
		File output = new File( args[ 1 ] );
		if(! output.exists() )
			output.mkdirs();
		int titlesWrote = 0;
		int linesWrote = 0;
		BufferedWriter writer = null;
		for( Row row : posts.getRow() ) {
			if( writer == null || linesWrote >= 1000 ) {
				if( writer != null ) {
					writer.flush();
					writer.close();
				}
				linesWrote = 0;
				titlesWrote++;
				File f2 = new File( output, String.valueOf( titlesWrote ) );
				writer = new BufferedWriter( new FileWriter( f2 ) );
			}
			if( row.getTitle() != null)
				writer.write( row.getTitle()  + "\n" );
			linesWrote++;
		}




	}

}
