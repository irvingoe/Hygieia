package com.capitalone.dashboard.model.score.settings;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QComponentAlert is a Querydsl query type for ComponentAlert
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QComponentAlert extends BeanPath<ComponentAlert> {

    private static final long serialVersionUID = 728463308L;

    public static final QComponentAlert componentAlert = new QComponentAlert("componentAlert");

    public final EnumPath<ScoreThresholdSettings.ComparatorType> comparator = createEnum("comparator", ScoreThresholdSettings.ComparatorType.class);

    public final NumberPath<Double> value = createNumber("value", Double.class);

    public QComponentAlert(String variable) {
        super(ComponentAlert.class, forVariable(variable));
    }

    public QComponentAlert(Path<? extends ComponentAlert> path) {
        super(path.getType(), path.getMetadata());
    }

    public QComponentAlert(PathMetadata<?> metadata) {
        super(ComponentAlert.class, metadata);
    }

}

