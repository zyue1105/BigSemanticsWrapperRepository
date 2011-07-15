package ecologylab.semantics.generated.library.imdb;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.generated.library.imdb.ImdbTitle;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  ImdbChart.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/15/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * IMDB chart
 */ 
@simpl_inherit
public class ImdbChart extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("imdb_title") @mm_name("results")	private ArrayList<ImdbTitle> results;

	public ImdbChart()
	{ }

	public ImdbChart(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<ImdbTitle> getResults()
	{
		return results;
	}

	public void setResults(ArrayList<ImdbTitle> results)
	{
		this.results = results;
	}
}
