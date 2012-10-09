//
// Actor.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.PersonNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.MovieNS 
{
	[SimplInherit]
	public class Actor : Person
	{
		[SimplScalar]
		private MetadataString role;

		[SimplScalar]
		private MetadataString rating;

		public Actor()
		{ }

		public Actor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Role
		{
			get{return role;}
			set
			{
				if (this.role != value)
				{
					this.role = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Rating
		{
			get{return rating;}
			set
			{
				if (this.rating != value)
				{
					this.rating = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}