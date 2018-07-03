package com.capitalone.dashboard.model.score.settings;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QScmScoreSettings is a Querydsl query type for ScmScoreSettings
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QScmScoreSettings extends BeanPath<ScmScoreSettings> {

    private static final long serialVersionUID = 1629304293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScmScoreSettings scmScoreSettings = new QScmScoreSettings("scmScoreSettings");

    public final QScoreComponentSettings _super = new QScoreComponentSettings(this);

    public final QScoreComponentSettings commitsPerDay;

    //inherited
    public final SimplePath<ScoreCriteria> criteria = _super.criteria;

    //inherited
    public final BooleanPath disabled = _super.disabled;

    public final NumberPath<Integer> numberOfDays = createNumber("numberOfDays", Integer.class);

    //inherited
    public final NumberPath<Integer> weight = _super.weight;

    public QScmScoreSettings(String variable) {
        this(ScmScoreSettings.class, forVariable(variable), INITS);
    }

    public QScmScoreSettings(Path<? extends ScmScoreSettings> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QScmScoreSettings(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QScmScoreSettings(PathMetadata<?> metadata, PathInits inits) {
        this(ScmScoreSettings.class, metadata, inits);
    }

    public QScmScoreSettings(Class<? extends ScmScoreSettings> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.commitsPerDay = inits.isInitialized("commitsPerDay") ? new QScoreComponentSettings(forProperty("commitsPerDay")) : null;
    }

}

