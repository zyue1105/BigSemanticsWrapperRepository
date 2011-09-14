package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;

/**
*  Tumblr.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Tumblr blog class
 */ 
@simpl_inherit
public class Tumblr extends CompoundDocument
{
	/** 
	 * Phone number of the restaurant
	 */ 
	@simpl_scalar	
	private MetadataString post;

	public Tumblr()
	{ }

	public Tumblr(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	post()
	{
		MetadataString	result = this.post;
		if (result == null)
		{
			result = new MetadataString();
			this.post = result;
		}
		return result;
	}

	public String getPost()
	{
		return this.post == null ? null : post().getValue();
	}

	public MetadataString getPostMetadata()
	{
		return post;
	}

	public void setPost(String post)
	{
		if (post != null)
			this.post().setValue(post);
	}

	public void setPostMetadata(MetadataString post)
	{
		this.post = post;
	}
}
