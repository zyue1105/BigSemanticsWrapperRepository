package ecologylab.semantics.generated.library;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Delicious home page class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class DeliciousHomepage
extends Document
{

@simpl_collection("bookmark") @xml_tag("bookmarks") @mm_name("bookmarks")
private ArrayList<Bookmark>	bookmarks;



/**
	Constructor
*/
public DeliciousHomepage()
{
 super();
}

/**
	Constructor
*/
public DeliciousHomepage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for bookmarks
*/
public ArrayList<Bookmark>	bookmarks()
{
	ArrayList<Bookmark>	result = this.bookmarks;
	if (result == null)
	{
		result = new ArrayList<Bookmark>();
		this.bookmarks = result;
	}
	return result;
}

/**
	Get the value of field bookmarks
*/
public ArrayList<Bookmark> getBookmarks()
{
	return this.bookmarks;
}

/**
	Set the value of field bookmarks
*/
public void setBookmarks(ArrayList<Bookmark> bookmarks)
{
	this.bookmarks = bookmarks;
}


}

