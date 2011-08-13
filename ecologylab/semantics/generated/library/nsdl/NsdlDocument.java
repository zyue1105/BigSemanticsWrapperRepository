package ecologylab.semantics.generated.library.nsdl;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.nsdl.Header;
import ecologylab.semantics.generated.library.rss.Dc;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  NsdlDocument.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class NsdlDocument extends Dc
{
	/** 
	 */ 
	@simpl_composite @mm_name("header")	private Header header;

	public NsdlDocument()
	{ }

	public NsdlDocument(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Header getHeader()
	{
		return header;
	}

	public void setHeader(Header header)
	{
		this.header = header;
	}
}
