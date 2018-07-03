package com.capitalone.dashboard.model.score.settings;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QScoreComponentSettings is a Querydsl query type for ScoreComponentSettings
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QScoreComponentSettings extends BeanPath<ScoreComponentSettings> {

    private static final long serialVersionUID = -375369669L;

    public static final QScoreComponentSettings scoreComponentSettings = new QScoreComponentSettings("scoreComponentSettings");

    public final SimplePath<ScoreCriteria> criteria = createSimple("criteria", ScoreCriteria.class);

    public final BooleanPath disabled = createBoolean("disabled");

    public final NumberPath<Integer> weight = createNumber("weight", Integer.class);

    public QScoreComponentSettings(String variable) {
        super(ScoreComponentSettings.class, forVariable(variable));
    }

    public QScoreComponentSettings(Path<? extends ScoreComponentSettings> path) {
        super(path.getType(), path.getMetadata());
    }

    public QScoreComponentSettings(PathMetadata<?> metadata) {
        super(ScoreComponentSettings.class, metadata);
    }

}

