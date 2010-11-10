//
//  FastflipSearch.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 11/04/10.
//  Copyright 2010 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using ecologylab.attributes;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;

namespace ecologylab.semantics.generated.library.fastflip 
{
	/// <summary>
	/// Fast Flip Search
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class FastflipSearch : Document
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_collection("thumbnail")]
		[xml_tag("thumbnails")]
		[mm_name("thumbnails")]
		private List<Thumbnail> thumbnails;

		public FastflipSearch()
		{ }

		public List<Thumbnail> Thumbnails
		{
			get{return thumbnails;}
			set{thumbnails = value;}
		}
	}
}
