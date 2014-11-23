package steps;


import code.monitoring.JUnitReportingRunner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Reuven Volnoboy on 11/23/14.
 */

@RunWith(JUnitReportingRunner.class)
public class JRunner extends JUnitStories {
    @Override
    protected List<String> storyPaths() {
        return Arrays
                .asList("example.story", "example2.story");
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE)
                        .withFormats(Format.HTML)
                        .withFormats(Format.STATS)
                        .withFormats(Format.XML));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new JbehaveSteps());
    }
    }