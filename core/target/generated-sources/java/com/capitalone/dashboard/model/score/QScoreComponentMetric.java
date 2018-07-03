package com.capitalone.dashboard.model.score;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QScoreComponentMetric is a Querydsl query type for ScoreComponentMetric
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QScoreComponentMetric extends BeanPath<ScoreComponentMetric> {

    private static final long serialVersionUID = -1258987687L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScoreComponentMetric scoreComponentMetric = new QScoreComponentMetric("scoreComponentMetric");

    public final QScoreComponentMetricBase _super;

    //inherited
    public final BooleanPath alert;

    public final ListPath<ScoreComponentMetricBase, QScoreComponentMetricBase> children = this.<ScoreComponentMetricBase, QScoreComponentMetricBase>createList("children", ScoreComponentMetricBase.class, QScoreComponentMetricBase.class, PathInits.DIRECT2);

    //inherited
    public final StringPath displayId;

    //inherited
    public final StringPath displayName;

    //inherited
    public final StringPath message;

    //inherited
    public final BooleanPath noScore;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> options;

    //inherited
    public final StringPath propagate;

    // inherited
    public final org.bson.types.QObjectId refId;

    //inherited
    public final StringPath score;

    //inherited
    public final StringPath state;

    //inherited
    public final StringPath total;

    //inherited
    public final StringPath weight;

    public QScoreComponentMetric(String variable) {
        this(ScoreComponentMetric.class, forVariable(variable), INITS);
    }

    public QScoreComponentMetric(Path<? extends ScoreComponentMetric> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QScoreComponentMetric(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QScoreComponentMetric(PathMetadata<?> metadata, PathInits inits) {
        this(ScoreComponentMetric.class, metadata, inits);
    }

    public QScoreComponentMetric(Class<? extends ScoreComponentMetric> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QScoreComponentMetricBase(type, metadata, inits);
        this.alert = _super.alert;
        this.displayId = _super.displayId;
        this.displayName = _super.displayName;
        this.message = _super.message;
        this.noScore = _super.noScore;
        this.options = _super.options;
        this.propagate = _super.propagate;
        this.refId = _super.refId;
        this.score = _super.score;
        this.state = _super.state;
        this.total = _super.total;
        this.weight = _super.weight;
    }

}

