//
// RottenMovie.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.MovieNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.MovieNS 
{
	/// <summary>
	/// RottenTomatoes movie description page
	/// </summary>
	[SimplInherit]
	public class RottenMovie : Movie
	{
		public RottenMovie()
		{ }

		public RottenMovie(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
