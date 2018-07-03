package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QRallyStoryStages is a Querydsl query type for RallyStoryStages
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QRallyStoryStages extends BeanPath<RallyStoryStages> {

    private static final long serialVersionUID = 1322697122L;

    public static final QRallyStoryStages rallyStoryStages = new QRallyStoryStages("rallyStoryStages");

    public final StringPath accepted = createString("accepted");

    public final StringPath backlog = createString("backlog");

    public final StringPath completed = createString("completed");

    public final StringPath defects = createString("defects");

    public final StringPath defined = createString("defined");

    public final StringPath inProgress = createString("inProgress");

    public final ListPath<UserStory, SimplePath<UserStory>> userStories = this.<UserStory, SimplePath<UserStory>>createList("userStories", UserStory.class, SimplePath.class, PathInits.DIRECT2);

    public QRallyStoryStages(String variable) {
        super(RallyStoryStages.class, forVariable(variable));
    }

    public QRallyStoryStages(Path<? extends RallyStoryStages> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRallyStoryStages(PathMetadata<?> metadata) {
        super(RallyStoryStages.class, metadata);
    }

}

