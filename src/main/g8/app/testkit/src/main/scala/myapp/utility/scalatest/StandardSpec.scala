package myapp.utility.scalatest

import org.scalatest.MustMatchers
import lerna.util.lang.Equals
import org.scalatest.wordspec.AnyWordSpecLike

trait StandardSpec extends AnyWordSpecLike with SpecAssertions with Equals with MustMatchers
