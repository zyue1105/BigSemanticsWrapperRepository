//
// Artwork.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.ArtworkNS 
{
	/// <summary>
	/// Artwork class
	/// </summary>
	[SimplInherit]
	public class Artwork : CreativeWork
	{
		/// <summary>
		/// Medium on which the work is done.
		/// </summary>
		[SimplScalar]
		private MetadataString medium;

		[SimplScalar]
		private MetadataString dimensions;

		public Artwork()
		{ }

		public Artwork(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Medium
		{
			get{return medium;}
			set
			{
				if (this.medium != value)
				{
					this.medium = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Dimensions
		{
			get{return dimensions;}
			set
			{
				if (this.dimensions != value)
				{
					this.dimensions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}