//
//  Surrogate.cs
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
	public class Surrogate : Metadata
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_composite]
		private Metadata clipping;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataString context;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_composite]
		private Document source;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_composite]
		private Document linksTo;

		public Surrogate()
		{ }

		public Metadata Clipping
		{
			get{return clipping;}
			set{clipping = value;}
		}

		public MetadataString Context
		{
			get{return context;}
			set{context = value;}
		}

		public Document Source
		{
			get{return source;}
			set{source = value;}
		}

		public Document LinksTo
		{
			get{return linksTo;}
			set{linksTo = value;}
		}
	}
}
