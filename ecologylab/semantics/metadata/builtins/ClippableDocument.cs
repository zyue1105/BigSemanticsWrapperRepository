//
//  ClippableDocument.cs
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

namespace ecologylab.semantics.metadata.builtins 
{
	/// <summary>
	/// missing java doc comments or could not find the source file.
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class ClippableDocument : Document
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataString context;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[mm_name("caption")]
		[simpl_scalar]
		private MetadataString caption;

		public ClippableDocument()
		{ }

		public MetadataString Context
		{
			get{return context;}
			set{context = value;}
		}

		public MetadataString Caption
		{
			get{return caption;}
			set{caption = value;}
		}
	}
}
