package com.ce.desktop.utils.datafx;

import com.ce.desktop.utils.CEConstants.CE.App;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author 1w3j
 */
public enum CEContainerAnimations {
    FADE((c) -> new ArrayList<>(
            Arrays.asList(
                    new KeyFrame(
                            Duration.ZERO,
                            new KeyValue(
                                    c.getPlaceholder().opacityProperty(),
                                    1.0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    ), new KeyFrame(
                            c.getDuration(),
                            new KeyValue(
                                    c.getPlaceholder().opacityProperty(),
                                    0.0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    )
            )
    )
    ),
    ZOOM_IN((c) -> new ArrayList<>(
            Arrays.asList(
                    new KeyFrame(
                            Duration.ZERO,
                            new KeyValue(
                                    c.getPlaceholder().scaleXProperty(),
                                    1,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().scaleYProperty(),
                                    1,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().opacityProperty(),
                                    1.0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    ),
                    new KeyFrame(
                            c.getDuration(),
                            new KeyValue(
                                    c.getPlaceholder().scaleXProperty(),
                                    4,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().scaleYProperty(),
                                    4,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().opacityProperty(),
                                    0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    )
            )
    )
    ),
    ZOOM_OUT((c) -> new ArrayList<>(
            Arrays.asList(
                    new KeyFrame(
                            Duration.ZERO,
                            new KeyValue(
                                    c.getPlaceholder().scaleXProperty(),
                                    1,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().scaleYProperty(),
                                    1,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().opacityProperty(),
                                    1.0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    ),
                    new KeyFrame(
                            c.getDuration(),
                            new KeyValue(
                                    c.getPlaceholder().scaleXProperty(),
                                    0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().scaleYProperty(),
                                    0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().opacityProperty(),
                                    0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    )
            )
    )
    ),
    SWIPE_LEFT((c) -> new ArrayList<>(
            Arrays.asList(
                    new KeyFrame(
                            Duration.ZERO,
                            new KeyValue(
                                    c.getView().translateXProperty(),
                                    c.getView().getWidth(),
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().translateXProperty(),
                                    -c.getView().getWidth(),
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    ),
                    new KeyFrame(
                            c.getDuration(),
                            new KeyValue(
                                    c.getView().translateXProperty(),
                                    0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().translateXProperty(),
                                    -c.getView().getWidth(),
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    )
            )
    )
    ),
    SWIPE_RIGHT((c) -> new ArrayList<>(
            Arrays.asList(
                    new KeyFrame(
                            Duration.ZERO,
                            new KeyValue(
                                    c.getView().translateXProperty(),
                                    -c.getView().getWidth(),
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().translateXProperty(),
                                    c.getView().getWidth(),
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    ),
                    new KeyFrame(
                            c.getDuration(),
                            new KeyValue(
                                    c.getView().translateXProperty(),
                                    0,
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            ),
                            new KeyValue(
                                    c.getPlaceholder().translateXProperty(),
                                    c.getView().getWidth(),
                                    App.Animations.MaterialDesign.INTERPOLATOR
                            )
                    )
            )
    )
    );

    private final Function<CEAnimatedFlowContainer, List<KeyFrame>> animationProducer;

    CEContainerAnimations (Function<CEAnimatedFlowContainer, List<KeyFrame>> animationProducer) {
        this.animationProducer = animationProducer;
    }

    public Function<CEAnimatedFlowContainer, List<KeyFrame>> getAnimationProducer () {
        return animationProducer;
    }
}
