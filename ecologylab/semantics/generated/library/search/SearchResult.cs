//
//  SearchResult.cs
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

namespace ecologylab.semantics.generated.library.search 
{
	/// <summary>
	/// missing java doc comments or could not find the source file.
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class SearchResult : Document
	{
		/// <summary>
		/// The heading of search result
		/// </summary>
		[simpl_scalar]
		private MetadataString heading;

		/// <summary>
		/// The snippet of search result
		/// </summary>
		[simpl_scalar]
		private MetadataString snippet;

		/// <summary>
		/// The link of the search result
		/// </summary>
		[simpl_scalar]
		private MetadataParsedURL link;

		/// <summary>
		/// Alternate link in search results
		/// </summary>
		[simpl_scalar]
		private MetadataParsedURL linkOther;

		public SearchResult()
		{ }

		public MetadataString Heading
		{
			get{return heading;}
			set{heading = value;}
		}

		public MetadataString Snippet
		{
			get{return snippet;}
			set{snippet = value;}
		}

		public MetadataParsedURL Link
		{
			get{return link;}
			set{link = value;}
		}

		public MetadataParsedURL LinkOther
		{
			get{return linkOther;}
			set{linkOther = value;}
		}
	}
}
