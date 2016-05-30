import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import net.htmlparser.jericho.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TagTest.class,
	SegmentTest.class,
	CharacterReferenceTest.class,
	SegmentGetStyleURISegmentsTest.class,
	ScriptTest.class,
	NodeIteratorTest.class,
	MicrosoftConditionalCommentTagTypesTest.class,
	StreamedTextTest.class,
	StreamedParseTextTest.class,
	StreamedSourceTest.class,
	StreamedSourceHugeFileTest.class,
	RendererTest.class,
	HTMLSanitiserTest.class
})
public class TestSuite {}