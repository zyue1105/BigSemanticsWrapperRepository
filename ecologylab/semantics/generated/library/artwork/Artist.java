package ecologylab.semantics.generated.library.artwork;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.generated.library.creativeWork.Author;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.generated.library.artwork.Artwork;

/**
*  Artist.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/03/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Artist extends Author
{
	/** 
	 */ 
	@simpl_collection("artwork")	@mm_name("artworks")
	private List<Artwork> artworks;

	public Artist()
	{ }

	public Artist(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Artwork> getArtworks()
	{
		return artworks;
	}

	public void setArtworks(List<Artwork> artworks)
	{
		this.artworks = artworks;
	}
}
